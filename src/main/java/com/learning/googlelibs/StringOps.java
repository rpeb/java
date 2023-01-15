package com.learning.googlelibs;

import com.google.common.base.Splitter;


public class StringOps {
    public static void main(String[] args) {
        // splitting
//        Splitter splitter = Splitter.on(".").omitEmptyStrings();
//        Iterable<String> split = splitter.split(".....wswqs.sqw.dwd...dwdwq");
//        split.forEach(System.out::println);

        Splitter splitter1 = Splitter.fixedLength(1);
        Iterable<String> split1 = splitter1.split("abcdefghijklmnopqrstuvwxyz");
        split1.forEach(System.out::println);
    }
}
