package com.learning.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Input: n = 3, k = 7
// Output: [181,292,707,818,929]
// Explanation: Note that 070 is not a valid number, because it has leading zeroes.
public class Main {

    public static void main(String[] args) {
        // System.out.println(partition("abbac"));
        // System.out.println(subsetsWithDup(new int[] {1,2,2}).toString());
        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,1,12,2,4));
        mergeSort(list, 0, 5);
        System.out.println(list.toString());
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        helper(s, 0, sub, result);
        return result;
    }

    private static void helper(String s, int start, List<String> sub, List<List<String>> result) {
        
        if (start == s.length()) {
            result.add(new ArrayList<>(sub));
            return;
        }

        int n = s.length();
        for (int i = start; i < n; ++i) {
            boolean palindrome = isPalindrome(s, start, i);
            if (!palindrome) 
                continue;
            
            String temp = s.substring(start, i+1);

            sub.add(temp);
            helper(s, i+1, sub, result);
            sub.remove(sub.size() - 1);
        }

    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        helper(nums, curr, res, 0);
        return res;
    }

    private static void helper(int[] nums, List<Integer> curr, List<List<Integer>> res, int start) {

        res.add(new ArrayList<>(curr));

        for (int i = start; i < nums.length; ++i) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            curr.add(nums[i]);
            helper(nums, curr, res, i + 1);
            curr.remove(curr.size() - 1);
        }
    }

    private static void mergeSort(List<Integer> list, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);

        merge(list, start, mid, end);
    }

    private static void merge(List<Integer> list, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();
        int x = start, y = mid + 1;

        // Merge the two halves
        while (x <= mid && y <= end) {
            if (list.get(x) <= list.get(y)) {
                temp.add(list.get(x));
                x++;
            } else {
                temp.add(list.get(y));
                y++;
            }
        }

        // Copy remaining elements from the left half
        while (x <= mid) {
            temp.add(list.get(x));
            x++;
        }

        // Copy remaining elements from the right half
        while (y <= end) {
            temp.add(list.get(y));
            y++;
        }

        // Copy the merged elements back to the original list
        for (int i = 0; i < temp.size(); i++) {
            list.set(start + i, temp.get(i));
        }
    }

}
