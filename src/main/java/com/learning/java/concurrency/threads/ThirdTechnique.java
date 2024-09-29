package com.learning.java.concurrency.threads;

import java.util.concurrent.TimeUnit;

public class ThirdTechnique {
    /**
     * Three things required to run a task in separate thread of execution:
     * 1. Thread class object
     * 2. Runnable interface implementation or THE TASK
     * 3. Invocation of start() method of the Thread object
     */

    public static void main(String[] args) {
        System.out.println("Repetitions thread starts here...");
        new ThirdTask(); // no way to get reference of the thread
        new ThirdTask(); // use case: mechanism to invalidate app cache at regular intervals
        System.out.println("Repetitions thread ends here...");
    }

}
class ThirdTask implements Runnable {
    private static int count = 0;
    private final int id;
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("<" + id + ">TICK TICK - " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    ThirdTask() {
        this.id = ++count;
        new Thread(this).start();
    }
}