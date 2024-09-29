package com.learning.java.concurrency;

public class StringBuilderorBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuilder = new StringBuffer();
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10000; ++i) {
                stringBuilder.append("A");
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10000; ++i) {
                stringBuilder.append("B");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception ignored) {

        }
//        assert stringBuilder.toString().equals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
//        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.length());
    }
}
