package com.learning.java.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class MethodReferences {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println(numbers.stream().reduce(0,Integer::sum));
//        System.out.println(numbers.stream().map(String::valueOf).reduce("",String::concat));

//        numbers.stream()
//                .map(String::valueOf)
//                .forEach(System.out::println);

//        Integer sum = numbers.stream()
//                .filter(e -> e % 2 == 0)
//                .mapToInt(e -> e * 2).sum();
//        System.out.println(sum);

        // find minimum
//        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(x -> x).summaryStatistics();
//        System.out.println(intSummaryStatistics.getSum());

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList()
                .forEach(System.out::println);

    }
}
