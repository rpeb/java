package com.learning.java.optional;

import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;

public class OptionalMain {

    private static Either<String, Integer> divide(int a, int b) {
        return b == 0 ? Either.left("Cannot divide by zero") : Either.right(a / b);
    }

    public static void main(String[] args) {
        // List<Integer> evenIntegersList = Helper.getEvenIntegersList();
        // Optional<Integer> firstOddNumber = evenIntegersList.stream().filter(n -> n % 2 == 1).findFirst();
        // System.out.println(firstOddNumber.orElseThrow(() -> {throw new NullPointerException("efefs");}));

        // int number = 2;
        
        // String result = Match(number).of(
        //     Case($(1), "One"),
        //     Case($(2), "Two"),
        //     Case($(), "Other")
        // );

        // System.out.println(result);

        // Either<String, Integer> result = divide(10, 0);
        
        // System.out.println(result.isLeft());  // Output: true
        // System.out.println(result.getLeft()); // Output: Cannot divide by zero

        // Lazy<Double> lazyValue = Lazy.of(Math::random);
        
        // System.out.println(lazyValue.get());  // Computed once
        // System.out.println(lazyValue.get());  // Same value as before
        // System.out.println(lazyValue.get());  // Same value as before
        // System.out.println(lazyValue.get());  // Same value as before

        // Tuple8<String,Integer,String,String,String,String,String,String> person = Tuple.of("Alice", 25, "a", "b", "v", "c", "s", "i");
        
        // System.out.println(person._1);  // Output: Alice
        // System.out.println(person._2);  // Output: 25
        // System.out.println(person._5);  // Output: v

        // Seq<String> seq = List.of("element", "element1", "element2");
        // System.out.println(seq.endsWith(List.of("element1", "element2")));
        

        // Seq<String> items = List.of("10", "20", "NaN", "30");

        // Seq<Try<Integer>> parsedNumbers = items
        //     .map(str -> Try.of(() -> Integer.parseInt(str)));

        // // Convert Try<Integer> to Option<Integer> (ignoring failures)
        // Seq<Option<Integer>> optionalNumbers = parsedNumbers.map(Try::toOption);

        // System.out.println(optionalNumbers);
        // // Output: List(Some(10), Some(20), None, Some(30))

        // // Extract only successful numbers
        // Seq<Integer> validNumbers = optionalNumbers.flatMap(Option::toSet);
        // System.out.println(validNumbers);  // Output: List(10, 20, 30)

        Try<Integer> result = Try.of(() -> Double.BYTES);
        Option<Integer> o = result.toOption();
        // System.out.println(result.get);
    }
}
