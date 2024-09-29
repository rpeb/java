package com.learning.java.dsa;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int rows = sc.nextInt();
        int mid = (2 * rows + 1) / 2;
        for (int i = 0; i < rows; ++i) {
            for (int j = 1; j <= 2 * rows + 1; ++j) {
                System.out.print(j);
                if (j == 2 * i + 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
