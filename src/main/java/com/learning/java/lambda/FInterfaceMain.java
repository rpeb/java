package com.learning.java.lambda;

import java.util.List;
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

public class FInterfaceMain {
    public static void main(String[] args) {
        Helper.printer(() -> System.out.println("a"));
        Helper.printer(() -> System.out.println("b"));
        List<Integer> l = List.of(1,2,3,4,5,6,7,8,9,10);
//        l.stream().filter(new EvenNumberFilter()).forEach(System.out::println);
    }
}