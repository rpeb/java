package com.learning.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main1 {

    public static void main(String[] args) throws IOException {
        int[] weights = new int[] {3,2,2,4,1,4};
        int[] w1 = new int[] {1,2,3,1,1};
        int days = 3;

        int capacity = getMinimumCapacity(w1, 4);

        System.out.println("min capacity = " + capacity);

//        System.out.println("days = " + getDaysWithCapacityAsMid(weights, 6));
//        System.out.println("days = " + getDaysWithCapacityAsMid(weights, 6));

    }

    private static int getMinimumCapacity(int[] weights, int days) {
        int l = Arrays.stream(weights).max().orElse(weights[0]);
        int h = Arrays.stream(weights).boxed().mapToInt(Integer::intValue).sum();
        int mid;

        // 10,11,12,13,...55
        // p(i): getDays(i) > days
        // FFFFTTTTT

        while (l < h) {
            mid = l + ((h - l) / 2);
            // if false l = mid + 1, else h = mid
            int daysRequiredToShipWithMidCapacity = getDaysWithCapacityAsMid(weights, mid);
            if (daysRequiredToShipWithMidCapacity > days) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    private static int getDaysWithCapacityAsMid(int[] weights, int capacity) {
        int numberOfDays = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                numberOfDays++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }

        return numberOfDays;
    }


}


