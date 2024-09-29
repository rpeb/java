package com.learning.java.concurrency.threads.lock;

public class DeadlockExample {
    // thread 1 holds lock on pen and waits for paper
    // thread 2 holds lock on paper and waits for pen
    // Mutual exclusion. Hold and Wait. Circular Wait. No Preemption


}

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to acquire paper resource.");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to acquire pen resource.");
        pen.finishWriting();
    }

    public void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

class Task1 implements Runnable {
    @Override
    public void run() {

    }
}

class Task2 implements Runnable {
    @Override
    public void run() {

    }
}