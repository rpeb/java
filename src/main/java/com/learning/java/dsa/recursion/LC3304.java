package com.learning.java.dsa.recursion;

public class LC3304 {
    public static void main(String[] args) {
        System.out.println(kthCharacter(5));
    }

    public static char kthCharacter(int k) {
        StringBuilder start = new StringBuilder("a");
        generateString(start, k);
        System.out.println(start);
        return start.charAt(k);
    }

    private static void generateString(StringBuilder str, int k) {
        if (str.length() >= k)
            return;
        int n = str.length();
        for (int i = 0; i < n; ++i) {
            str.append((char) (str.charAt(i) + 1));
        }
        generateString(str, k);
    }
}
