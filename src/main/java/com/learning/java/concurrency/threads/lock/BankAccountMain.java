package com.learning.java.concurrency.threads.lock;


public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccountThread thread1 = new BankAccountThread(50, bankAccount);
        BankAccountThread thread2 = new BankAccountThread(50, bankAccount);
        BankAccountThread thread3 = new BankAccountThread(10, bankAccount);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("threads finished");
    }
}
