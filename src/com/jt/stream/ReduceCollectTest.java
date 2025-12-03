package com.jt.stream;

import java.util.*;
import java.util.stream.*;

public class ReduceCollectTest {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());

        /* ===========================================================
           1. reduce() — Immutable reduction
           =========================================================== */
        System.out.println("----- reduce() — Sum numbers -----");
        int sum = numbers.stream().reduce(0, Integer::sum); // accumulator
        System.out.println("Sum using reduce(): " + sum);

        /* ===========================================================
           2. collect() — Mutable reduction
           =========================================================== */
        System.out.println("\n----- collect() — Collect numbers into List -----");
        List<Integer> collected = numbers.stream().collect(ArrayList::new, List::add, List::addAll);
        System.out.println("List using collect(): " + collected);

        /* ===========================================================
           3. reduce() used incorrectly to build a List (BAD)
           =========================================================== */
        System.out.println("\n----- WRONG: reduce() used to build a List -----");

        List<Integer> wrongList = numbers.parallelStream()
                .reduce(new ArrayList<>(),
                        (list, elem) -> {  // accumulator
                            list.add(elem);
                            return list;
                        },
                        (list1, list2) -> { // combiner
                            list1.addAll(list2);
                            return list1;
                        });

        System.out.println("List using reduce() (WRONG but may appear correct): " + wrongList);
        System.out.println("Note: This is dangerous — reduce() breaks immutability.");

        /* ===========================================================
           4. Associativity problem in parallel reduce()
           =========================================================== */
        System.out.println("\n----- Associativity Problem with reduce() -----");

        // Non-associative operation: subtraction (a - b != (a - b) in any grouping)
        int wrongParallelResult = numbers.parallelStream().reduce(0, (a, b) -> a - b);
        int sequentialResult = numbers.stream().reduce(0, (a, b) -> a - b);

        System.out.println("Sequential reduce with subtraction: " + sequentialResult);
        System.out.println("Parallel reduce with subtraction  : " + wrongParallelResult);
        System.out.println("Parallel result is WRONG because subtraction is NOT associative!");

        /* ===========================================================
           5. Correct associative use of reduce()
           =========================================================== */
        System.out.println("\n----- Correct Associative reduce() (Sum) -----");

        int correctParallelSum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel reduce with sum (correct): " + correctParallelSum);
    }
}