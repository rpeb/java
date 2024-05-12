package com.learning.java.collections;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("hello");
        al.add(2);
        al.set(1, 3);
        System.out.println(al);
        al.clear();
    }
}
