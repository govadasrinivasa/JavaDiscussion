package com.jt.stream;

import java.util.*;
import java.util.stream.*;

public class StreamStateDemo {

    public static void main(String[] args) {

//        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        List<Integer> numbers = Arrays.asList(6,4,7,2,9,14,12);

        System.out.println("----- Stateless Operation (filter) - Sequential -----");
        numbers.stream()
               .filter(n -> {
                   System.out.println("filter (sequential): " + n);
                   return n % 2 == 0;
               })
               .forEach(n -> System.out.println("forEach: " + n));

        System.out.println("\n----- Stateless Operation (filter) - Parallel -----");
        numbers.parallelStream()
               .filter(n -> {
                   System.out.println("filter (parallel): " + n);
                   return n % 2 == 0;
               })
               .forEach(n -> System.out.println("forEach: " + n));

        System.out.println("\n----- Stateful Operation (sorted) - Sequential -----");
        numbers.stream()
               .sorted((a, b) -> {
                   System.out.println("sorted comparing (sequential): " + a + " vs " + b);
                   return Integer.compare(a, b);
               })
               .forEach(n -> System.out.println("forEach: " + n));

        System.out.println("\n----- Stateful Operation (sorted) - Parallel -----");
        numbers.parallelStream()
               .sorted((a, b) -> {
                   System.out.println("sorted comparing (parallel): " + a + " vs " + b);
                   return Integer.compare(a, b);
               })
               .forEach(n -> System.out.println("forEach: " + n));

        System.out.println("\n----- Stateful Operation (distinct) - Parallel -----");
        List<Integer> duplicateList = Arrays.asList(5, 5, 6, 7, 7, 8, 9, 10);

        duplicateList.parallelStream()
                .distinct()
                .forEach(n -> System.out.println("distinct: " + n));
    }
}
