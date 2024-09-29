package com.learning.java;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private static final long serialVersionUID = 1L;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}

class Base {
    protected void foo() {}
}
class Derived extends Base {
//    void foo() {} compiler error
}