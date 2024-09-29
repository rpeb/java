package com.learning.java.dsa.cses;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        if (n <= 4) {
            if (n == 1) {
                stringBuilder.append(1);
            } else if (n == 4) {
                stringBuilder.append("2 4 1 3");
            } else {
                stringBuilder.append("NO SOLUTION");
            }
            System.out.println(stringBuilder);
            return;
        }
        int i = 1;
        while (i <= n) {
            stringBuilder.append(i).append(" ");
            i += 2;
        }
        int j = 2;
        while (j <= n) {
            stringBuilder.append(j).append(" ");
            j += 2;
        }
        System.out.println(stringBuilder);
    }
}
