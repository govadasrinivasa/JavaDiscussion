package com.jt.utility;

public class TypeConversionTest {

    public static void main(String[] args) {

        System.out.println("----- Implicit Conversion (Widening) -----");

        int intVal = 100;
        long longVal = intVal;          // int → long (implicit)
        float floatVal = longVal;       // long → float (implicit)

        System.out.println("int value: " + intVal);
        System.out.println("long value (int → long): " + longVal);
        System.out.println("float value (long → float): " + floatVal);


        System.out.println("\n----- Explicit Conversion (Narrowing) -----");

        double doubleVal = 99.99;
        long longVal2 = (long) doubleVal;      // double → long (explicit)
        int intVal2 = (int) longVal2;          // long → int (explicit)

        System.out.println("double value: " + doubleVal);
        System.out.println("long value (double → long): " + longVal2);
        System.out.println("int value (long → int): " + intVal2);


        System.out.println("\n----- Explicit Conversion with Data Loss -----");

        int bigInt = 300;
        byte smallByte = (byte) bigInt;        // int → byte (overflow)

        System.out.println("Original int: " + bigInt);
        System.out.println("Converted byte (int → byte): " + smallByte);
        
        Product product1 = new Product("Watch", "Accessories", 5000, 104, 3.9);
        if (product1 instanceof Product) {
			System.out.println(product1);
		}
    }
}
