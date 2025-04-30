package com.learning.java.design_patterns.rguru.composite;


import java.util.ArrayList;
import java.util.List;

// client
public class ImageEditor {
    CompoundGraphic all;

    void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1,2));
        all.add(new Circle(5,3, 10));
    }

    void groupSelected(List<Graphic> graphics) {
        CompoundGraphic group = new CompoundGraphic();


    }
}
