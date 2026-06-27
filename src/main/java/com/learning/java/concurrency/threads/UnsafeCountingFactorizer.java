package com.learning.java.concurrency.threads;

public class UnsafeCountingFactorizer {
  private long count = 0l;

  public long getCount() {
    return count;
  }

  public void increment() {
    count++;
  }
}
