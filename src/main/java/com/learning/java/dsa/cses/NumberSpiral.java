//package com.learning.java.dsa.cses;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= t; ++i) {
            long y = scanner.nextLong();
            long x = scanner.nextLong();
            solve(y, x, stringBuilder);
        }
        System.out.println(stringBuilder);
    }

    private static void solve(long y, long x, StringBuilder stringBuilder) {
        long n = Math.max(x, y);
        long seed = n * (n-1) + 1;
        if (x == y) {
            stringBuilder.append(seed).append(System.lineSeparator());
            return;
        }
        long l = seed - Math.abs(y - x);
        long m = seed + Math.abs(y - x);
        if (n % 2 == 1) {
            stringBuilder.append(y > x ? l : m).append(System.lineSeparator());
        } else {
            stringBuilder.append(y > x ? m : l).append(System.lineSeparator());
        }
    }
}
