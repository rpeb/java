package com.learning.java.dsa.cses;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        method1(str);
        method2(str);
    }
    private static void method1(String str) {
        int res = 0, m = 0;
        char c = 'A';
        for (char d : str.toCharArray()) {
            if (c == d) {
                m++;
                res = Math.max(res, m);
            } else {
                m = 1;
                c = d;
            }
        }
        System.out.println(res);
    }

    private static void method2(String str) {
        int n = str.length();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int m = 1, M = 0;
        for (int i = 1; i < n; ++i) {
            while (i < n && str.charAt(i) == str.charAt(i - 1)) {
                m++;
                i++;
            }
            M = Math.max(M, m);
            m = 1;
        }
        System.out.println(M);
    }

}
