package com.learning.java;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            long element = sc.nextLong();
            System.out.println(isSameSpectator(element) ? "YES" : "NO");
        }
    }

    private static boolean isSameSpectator(long k) {
        return k % 3 == 1;
    }
            
    
}
