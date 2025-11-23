package com.jt.utility;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

    // Static method
    public static void printStatic(String msg) {
        System.out.println("Static Method: " + msg);
    }

    // Instance method
    public void printInstance(String msg) {
        System.out.println("Instance Method: " + msg);
    }

    // Constructor reference example class
    static class Message {
        Message(String msg) {
            System.out.println("Constructor: " + msg);
        }
    }

    public static void main(String[] args) {
    	
    	// Old style
        // ---------- 1. Static Method Reference ----------
    	MethodReferenceTest obj1 = new MethodReferenceTest();
        for(String names1:Arrays.asList("Ravi", "Anjali", "Kiran")) {
        	MethodReferenceTest.printStatic(names1);
        	obj1.printInstance(names1);
        	new Message(names1);
        }

        // New style
        // ---------- 1. Static Method Reference ----------
        List<String> names2 = Arrays.asList("Ravi", "Anjali", "Kiran");
        names2.forEach(MethodReferenceTest::printStatic); // list.forEach();

        // ---------- 2. Instance Method Reference ----------
        MethodReferenceTest obj = new MethodReferenceTest();
        names2.forEach(obj::printInstance);

        // ---------- 3. Constructor Reference ----------
        names2.forEach(Message::new);
    }
}

