package com.learning.java.design_patterns.builder;


import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
    private String name;
    private Integer age;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }
    public Student build() {
        return new Student(name, age);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("a", 1));
        students.add(new Student("e", null));
        students.add(new StudentBuilder().setAge(1).setName("b").build());
        students.add(new StudentBuilder().setName("c").build());
        students.add(new StudentBuilder().setAge(4).build());
        students.forEach(student -> System.out.println(student.toString()));
    }
}
