package com.learning.java.lambda;

import java.util.List;

public class Helper {
    public static List<Person> createPeople() {
        return List.of(
            new Person("A", Gender.MALE, 20),
            new Person("A", Gender.FEMALE, 22),
            new Person("B", Gender.MALE, 23),
            new Person("C", Gender.MALE, 43),
            new Person("D", Gender.FEMALE, 32)
        );
    }

    public static void printer(FInterface fInterface) {
        fInterface.run();
    }

    public static List<Integer> getEvenIntegersList() {
        return List.of(2,4,6,8,10);
    }

    public static List<Integer> getOddIntegersList() {
        return List.of(1,3,5,7,9);
    }
}
