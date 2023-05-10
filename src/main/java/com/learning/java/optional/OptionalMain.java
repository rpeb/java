package com.learning.java.optional;

import com.learning.java.lambda.Helper;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalMain {

    public static void main(String[] args) {
        List<Integer> evenIntegersList = Helper.getEvenIntegersList();
        Optional<Integer> firstOddNumber = evenIntegersList.stream().filter(n -> n % 2 == 1).findFirst();
        System.out.println(firstOddNumber.orElseThrow(() -> {throw new NullPointerException("efefs");}));
    }
}
