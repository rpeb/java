package com.learning.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UsingFixedThreadPool {
    private static final Integer THREAD_COUNT = 3;
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        for (int i = 0; i < THREAD_COUNT+1; ++i) {
            executorService.execute(new LoopTask());
        }
        executorService.shutdown();
    }
}

class LoopTask implements Runnable {

    private static int count = 0;
    private final int id;
    @Override
    public void run() {
        System.out.println("Task id = " + id + " started..");
        for (int i = 0; i < 10; ++i) {
            System.out.println("<" + id + "> TICK TICK - " + i);
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Task id = " + id + " ended..");
    }
    LoopTask() {
        this.id = ++count;
    }
}