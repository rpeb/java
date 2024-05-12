package com.learning.java;

import org.apache.commons.codec.binary.Base32;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainT {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character, Integer> freqa = new HashMap<>();
        Map<Character, Integer> freqb = new HashMap<>();
        for (Character c : a.toCharArray()) {
            if (!freqa.containsKey(c))
                freqa.put(c, 1);
            freqa.put(c, freqa.get(c) + 1);
        }
        for (Character c : b.toCharArray()) {
            if (!freqb.containsKey(c))
                freqb.put(c, 1);
            freqb.put(c, freqb.get(c) + 1);
        }
        for (Character character : freqa.keySet()) {
            if (!Objects.equals(freqa.get(character), freqb.get(character)))
                return false;
        }
        return true;
    }

    private static boolean isPowerOfTwo(Integer x) {
        return (x & (x - 1)) == 0;
    }

    // returns num % (2 ^ power)
    private static int modPowerOfTwo(int num, int power) {
        int count = 0;
        int rem = 0;
        while (count < power) {
            rem += (num & 1) * Math.pow(2, count);
            count++;
            num >>= 1;
        }
        return rem;
    }

    private static String lookAndTell(Integer n) {
        String first = "1";
        String lastVal = "";
        for (int i = 0; i < n; ++i) {
            lastVal = first;
            int length = lastVal.length();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; ++j) {
                char ch = lastVal.charAt(j);
                int count = 1;
                while (j + 1 < length && lastVal.charAt(j) == lastVal.charAt(j + 1)) {
                    j++;
                    count++;
                }
                sb.append(count).append(ch);
            }
            first = sb.toString();
            System.out.println("firstSize = " + first.length());
        }
        return lastVal;
    }

    public static int compress(char[] chars) {
        StringBuilder res = new StringBuilder();
        int n = chars.length;
        // System.out.println(n);
        int count = 0;
        for (int i = 0; i < n; ++i) {
            count = 1;
            char curr = chars[i];
            while (i + 1 < n && chars[i] == chars[i+1]) {
                i++;
                count++;
            }
            if (count > 1)
                res.append(curr).append(count);
            else
                res.append(curr);
        }
        return res.toString().length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compress(s.toCharArray()));
    }
}

