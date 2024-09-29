package com.learning.java.dsa.epi.string;


public class BasicConversions {
    public static void main(String[] args) {
        testPalindrome();
        testConvert();
        testBaseConvert();
    }

    private static void testConvert() {
        String[] testCases = {
            "1", "22", "333", "4444", "55555", "666666", "7777777",
            "88888888", "999999999", "101", "00123", "9223372036854775807",
            "-123", "9223372036854775808"
        };
        for (String testCase: testCases) {
            System.out.print("str = " + testCase + " num = ");
            System.out.println(convertToNumber(testCase));
        }
    }

    private static void testPalindrome() {
        String[] testCases = {
            "a","","aba","abba","abcba","abccba","abcdba",
            "abccba","abcddcba","abcdeedcba","abcdeedcbaa",
            "abcdeedcbaaa","abcdeedcbaaaa","abcdeedcbaaaaa",
        };
        for (String testCase: testCases) {
            System.out.print("str = " + testCase + " is palindrome: ");
            System.out.println(isPalindrome(testCase));
        }
    }

    private static long convertToNumber(String str) {
        return convertToNumber(str, 10);
    }

    private static long convertToNumber(String str, int base) {
        long result = 0;
        for (int i = str.charAt(0) == '-' ? 1 : 0; i < str.length(); ++i) {
            final int digit = str.charAt(i) - '0';
            result = result * base + digit;
        }
        return str.charAt(0) == '-' ? -result : result;
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        int left = 0, right = n - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right)))
                return false;
            ++left;
            --right;
        }
        return true;
    }

    private static String baseConvert(String str, int fromBase, int toBase) {
        long converted = convertToNumber(str, fromBase);
        StringBuilder stringBuilder = new StringBuilder();
        while (converted > 0) {
            int digit = (int) (converted % toBase);
            stringBuilder.append(digit >= 10 ? (char) ('A' + digit - 10) : (char) ('0' + digit));
            converted /= toBase;
        }
        return stringBuilder.reverse().toString();
    }

    private static void testBaseConvert() {
        String[][] testCases = {
            {"1010", "2", "10", "10"}, // Binary to Decimal
            {"10", "10", "2", "1010"}, // Decimal to Binary
            {"10", "10", "2", "1010"}, // Decimal to Binary
            {"7B", "16", "2", "1111011"}, // Hexadecimal to Binary
            {"1A", "16", "10", "26"}, // Hexadecimal to Decimal
            {"26", "10", "16", "1A"}, // Decimal to Hexadecimal
            {"123", "10", "8", "173"}, // Decimal to Octal
            {"0", "2", "10", "0"}, // Edge Case - Zero
            {"-1010", "2", "10", "-10"}, // Edge Case - Negative Number
            {"173", "8", "10", "123"}, // Octal to Decimal
            {"9223372036854775807", "10", "16", "7FFFFFFFFFFFFFFF"} // Edge Case - Large Number
        };

        for (String[] testCase : testCases) {
            String input = testCase[0];
            int fromBase = Integer.parseInt(testCase[1]);
            int toBase = Integer.parseInt(testCase[2]);
            String expectedOutput = testCase[3];

            String output = baseConvert(input, fromBase, toBase);
            System.out.printf("Input: %s (Base %d) -> Output: %s (Base %d) | Expected: %s | Result: %s\n",
                input, fromBase, output, toBase, expectedOutput, output.equals(expectedOutput) ? "PASS" : "FAIL");
        }
    }
}
