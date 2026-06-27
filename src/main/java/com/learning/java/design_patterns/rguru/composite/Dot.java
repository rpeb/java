package com.learning.java.design_patterns.rguru.composite;

import java.util.Iterator;

public class Dot implements Graphic {
  private int x;
  private int y;

  public Dot(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int x, int y) {
    this.x += x;
    this.y += y;
  }

  @Override
  public void draw() {}

  @Override
  public Iterator iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }
}
