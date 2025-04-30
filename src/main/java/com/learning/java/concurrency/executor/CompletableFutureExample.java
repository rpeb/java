package com.learning.java.concurrency.executor;

import lombok.AllArgsConstructor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<TaskName> task1 = () -> FuturesPlay.doTask("task1", 3);
        Supplier<TaskName> task2 = () -> FuturesPlay.doTask("task2", 4);
        Supplier<TaskName> task3 = () -> FuturesPlay.doTask("task3", 5);
        Supplier<TaskName> task4 = () -> FuturesPlay.doTask("task4", 6);

        CompletableFuture<TaskName> future1 = CompletableFuture.supplyAsync(task1);
        CompletableFuture<TaskName> future2 = CompletableFuture.supplyAsync(task2);

        CompletableFuture<Void> future =
            future1
            .thenCombine(future2, (task1Result, task2Result) -> task1Result.name() + task2Result.name())
            .thenApply(data -> data + " Handled Apply")
            .thenCompose(s -> {
                CompletableFuture<TaskName> future3 = CompletableFuture.supplyAsync(task3);
                CompletableFuture<TaskName> future4 = CompletableFuture.supplyAsync(task4);
                return future3.thenCombine(future4, (result3, result4) -> s + " " + result4 + " " + result3);
            })
            .thenAccept(System.out::println);

        future.join();

    }


}

record TaskName (String name, int secs) {};

class FuturesPlay {
    public static TaskName doTask(String name, int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new TaskName(name, time);
    }
}
