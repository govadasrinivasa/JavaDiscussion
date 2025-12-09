package com.jt;

public class StringTypesTest {

    public static void main(String[] args) {

        System.out.println("----- STRING IMMUTABLE -----");

        String s1 = "Hello";
        String s2 = s1;    // Both refer to same object

        s1 = s1 + " World";     // Creates NEW object (immutable)

        System.out.println("s1: " + s1);
        System.out.println("s2 (unchanged): " + s2);
        System.out.println("Are s1 and s2 same object? " + (s1 == s2));


        System.out.println("\n----- STRINGBUILDER (MUTABLE, NOT THREAD-SAFE) -----");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // Modifies same object

        System.out.println("StringBuilder content: " + sb);
        System.out.println("Capacity: " + sb.capacity());  // Shows dynamic capacity


        System.out.println("\n----- STRINGBUFFER (MUTABLE + THREAD-SAFE) -----");

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");  // Thread-safe operations

        System.out.println("StringBuffer content: " + sbf);
        System.out.println("Length : " + sbf.length());  // Shows dynamic capacity
        System.out.println("Capacity: " + sbf.capacity());


        System.out.println("\n----- PERFORMANCE COMPARISON -----");

        long start, end;

        // String (slow due to immutability)
        start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 20000; i++) {
            str = str + i;     // Creates NEW object each time
        }
        end = System.currentTimeMillis();
        System.out.println("String time: " + (end - start) + " ms");

        // StringBuilder (fast)
        start = System.currentTimeMillis();
        StringBuilder sbFast = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sbFast.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end - start) + " ms");

        // StringBuffer (slower due to synchronization)
        start = System.currentTimeMillis();
        StringBuffer sbfFast = new StringBuffer();
        for (int i = 0; i < 20000; i++) {
            sbfFast.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end - start) + " ms");
    }
}
