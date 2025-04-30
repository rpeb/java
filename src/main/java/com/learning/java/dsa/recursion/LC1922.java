package com.learning.java.dsa.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LC1922 {
    private static final int[] evens = new int[] {0,2,4,6,8};
    private static final int[] primes = new int[] {2,3,5,7};
    private static final int MOD = 1000000000 + 7;
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(countGoodNumbers(n));
    }

    private static int countGoodNumbers(long n) {
        long evenCount = 5; // 0, 2, 4, 6, 8
        long primeCount = 4; // 2, 3, 5, 7
        long mod = 1000000007;

        // Total combinations for even and odd positions
        long totalEvenPositions = (n + 1) / 2; // Number of even positions
        long totalOddPositions = n / 2; // Number of odd positions

        // Calculate the result using modular exponentiation
        long result = (modularExponentiation(evenCount, totalEvenPositions, mod) *
                       modularExponentiation(primeCount, totalOddPositions, mod)) % mod;

        return (int) result;
    }

    private static long modularExponentiation(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {                
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}
