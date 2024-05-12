package com.learning.java.design_patterns.singleton;

import java.util.Objects;

public class SingA {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; ++i) {
            Singleton s1 = Singleton.getInstance();
            Singleton s2 = Singleton.getInstance();
            if (s1.hashCode() != s2.hashCode()) {
                System.out.println("hahahah");
                break;
            }
        }
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {super();}
    public static Singleton getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}