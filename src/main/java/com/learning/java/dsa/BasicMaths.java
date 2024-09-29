package com.learning.java.dsa;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class BasicMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        System.out.println(isPalindrome(num));
//        System.out.println(isArmstrong(num));
        System.out.println(gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return gcd(num2, num1 % num2);
        }
    }

    private static boolean isArmstrong(int num) {
        int digits = getDigits(num);
        int res = 0;
        int cp = num;
        while (num > 0) {
            res += Math.pow(num % 10, digits);
            num /= 10;
        }
        return res == cp;
    }

    private static int getDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    private static boolean isPalindrome(int num) {
        // 4554
        int rev = 0;
        int cp = num;
        while (num > 0) {
            int x = num % 10;
            rev = rev * 10 + x;
            num /= 10;
        }
        return rev == cp;
    }
}
