package com.learning.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Prakash","3213213", 12));
        employees.add(new Employee("Ankit","232432", 11));
        employees.add(new Employee("Shubham","4521122", 45));
        System.out.println(employees);
        Collections.sort(employees, (a,b) -> a.getName().compareTo(b.getName())); // comparable logic
        System.out.println(employees);
    }
}
