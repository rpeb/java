package com.learning.java.design_patterns.rguru.composite;

import java.util.List;

public class CompoundGraphic implements Graphic {

    private List<Graphic> children;

    @Override
    public void move(int x, int y) {
        for (Graphic g : children) {
            g.move(x, y);
        }
    }

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void draw() {

    }
}
