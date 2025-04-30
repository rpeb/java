package com.learning.java;

import java.util.function.Function;

public class CurryingExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> curriedAdd =
            a -> b -> c -> a + b + c;

        // Partially applying the function
        Function<Integer, Function<Integer, Integer>> addTwo = curriedAdd.apply(2);
        Function<Integer, Integer> addTwoAndThree = addTwo.apply(3);
        int result = addTwoAndThree.apply(5);

        System.out.println(result);  // Output: 10

        Function<Integer, Function<Integer, Function<Integer, Integer>>> curriedMultiply =
            a -> b -> c -> a * b * c;
        
        Function<Integer, Function<Integer, Integer>> multiplyTwo = curriedMultiply.apply(2);
        Function<Integer, Integer> multiplyThree = multiplyTwo.apply(3);
        System.out.println(multiplyThree.apply(5));
    }
}
