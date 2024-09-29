package com.learning.java.googlelibs;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        for (int i = 0; i < 100000; ++i) {

        }
        System.out.println("elapsed time = " + stopwatch.elapsed(TimeUnit.NANOSECONDS));
    }
}
