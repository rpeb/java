package com.learning.java.concurrency.threads;

import java.util.concurrent.TimeUnit;

public class SecondTechnique {
    /**
     * Three things required to run a task in separate thread of execution:
     * 1. Thread class object
     * 2. Runnable interface implementation or THE TASK
     * 3. Invocation of start() method of the Thread object
     */

    public static void main(String[] args) {
        System.out.println("Main thread starts here...");
        new SecondTask().start();
        new SecondTask().start();
        System.out.println("Main thread ends here...");
    }

}
class SecondTask extends Thread {
    private static int count = 0;
    private int id;
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

    SecondTask() {this.id = ++count;}
}