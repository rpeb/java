package com.learning.java.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberFilter implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer % 2 == 0;
    }
}

@FunctionalInterface
interface FInterface extends Runnable {

}

class Dummy {
    public static void print() {
        System.out.println("print dummy!");
    }
}

public class FInterfaceMain {
    public static void main(String[] args) {
//        FInterface fn1 = Dummy::print;
//        fn1.run();
        Predicate<Integer> filter1 = (num) -> {
            return num % 2 == 0;
        };
//        EvenNumberFilter evenNumberFilter = new EvenNumberFilter();
//        Predicate<Integer> filter2 = (num) -> num == 6;
//        Predicate<String> lengthGreaterThan3 = (s) -> s.length() > 3;
        List.of("a","ab","abc","abcd","defg","hij","klmno").stream().map(String::toUpperCase).forEach(System.out::println);
//        Map<String, Integer> companyToNumberOfEmployeesMap = new HashMap<>();
//        companyToNumberOfEmployeesMap.put("TCS", 1458434);
//        companyToNumberOfEmployeesMap.put("Infosys", 321312);
//        companyToNumberOfEmployeesMap.put("Increff", 300);
//        Function<String, Integer> mapper = (s) -> s.equals("Increff") ? 301: 299;
//        Function<String, Integer> mapper1 = (s) -> s.equals("Amazon") ? 301: 299;
//        companyToNumberOfEmployeesMap.computeIfAbsent("Increff", mapper);
//        System.out.println(companyToNumberOfEmployeesMap.get("Increff"));
//        companyToNumberOfEmployeesMap.computeIfAbsent("Amazon", mapper1);
//        System.out.println(companyToNumberOfEmployeesMap.get("Amazon"));
    }
}