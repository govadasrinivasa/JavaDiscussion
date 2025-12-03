package com.jt.stream;

import java.util.*;
import java.util.stream.*;

public class MapFlatMapMapMultiDemo {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "world");

        System.out.println("----- map(): Convert each word to its length -----");
        List<Integer> mapResult = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Result of map(): " + mapResult);


        System.out.println("\n----- flatMap(): Split each word into characters -----");
        List<String> flatMapResult = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());
        System.out.println("Result of flatMap(): " + flatMapResult);


        System.out.println("\n----- mapMulti(): Emit multiple values without creating a Stream -----");
        List<Object> mapMultiResult = words.stream()
                .mapMulti((word, consumer) -> {
                    for (char c : word.toCharArray()) {
                        consumer.accept(String.valueOf(c));
                    }
                })
                .collect(Collectors.toList());
        System.out.println("Result of mapMulti(): " + mapMultiResult);


        System.out.println("\n----- Comparison: map vs flatMap vs mapMulti -----");
        System.out.println("map():        One input → One output");
        System.out.println("flatMap():    One input → Many outputs (via Stream)");
        System.out.println("mapMulti():   One input → Many outputs (without creating Stream)");
    }
}

