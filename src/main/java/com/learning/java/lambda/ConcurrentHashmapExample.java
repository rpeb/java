package com.learning.java.lambda;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

@Getter
@Setter
class LetterCount {
    private Character letter;
    private Integer count;
}

public class ConcurrentHashmapExample {
//    public static void main(String[] args) {
//        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
//        Function<Character, Integer> function = (c) ->
//        hashMap.computeIfAbsent("a", (k) -> k);
//    }
}
