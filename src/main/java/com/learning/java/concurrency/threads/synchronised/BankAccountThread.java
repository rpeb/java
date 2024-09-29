package com.learning.java.concurrency.threads.synchronised;

public class BankAccountThread extends Thread {
    private final BankAccount bankAccount;
    private int amount = 0;

    public BankAccountThread(int amount, BankAccount bankAccount) {
        this.amount = amount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}
