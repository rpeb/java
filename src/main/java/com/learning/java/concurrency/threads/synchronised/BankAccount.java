package com.learning.java.concurrency.threads.synchronised;

public class BankAccount extends Thread {
    private int balance = 100;
    public synchronized void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println(Thread.currentThread().getName() + " attempting to withdraw amount: " + amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew amount: " + amount + ", remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance..");
        }
    }
}
