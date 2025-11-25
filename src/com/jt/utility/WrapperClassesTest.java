package com.jt.utility;

public class WrapperClassesTest {

    public static void main(String[] args) {

        // ----- Byte -----
        Byte bObj = Byte.valueOf((byte) 10);        // Boxing
        byte b = bObj;                               // Unboxing
        System.out.println("Byte: " + bObj + " (unboxed: " + b + ")");

        // ----- Short -----
        Short sObj = Short.valueOf((short) 200);
        short s = sObj;
        System.out.println("Short: " + sObj + " (unboxed: " + s + ")");

        // ----- Integer -----
        Integer iObj = Integer.valueOf(500);
        int i = iObj;
        System.out.println("Integer: " + iObj + " (unboxed: " + i + ")");
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);

        // ----- Long -----
        Long lObj = Long.valueOf(999999999L);
        long l = lObj;
        System.out.println("Long: " + lObj + " (unboxed: " + l + ")");

        // ----- Float -----
        Float fObj = Float.valueOf(12.34f);
        float f = fObj;
        System.out.println("Float: " + fObj + " (unboxed: " + f + ")");

        // ----- Double -----
        Double dObj = Double.valueOf(99.999);
        double d = dObj;
        System.out.println("Double: " + dObj + " (unboxed: " + d + ")");

        // ----- Character -----
        Character cObj = Character.valueOf('A');
        char c = cObj;
        System.out.println("Character: " + cObj + " (unboxed: " + c + ")");
        System.out.println("Is letter? " + Character.isLetter(cObj));

        // ----- Boolean -----
        Boolean boolObj = Boolean.valueOf(true);
        boolean bool = boolObj;
        System.out.println("Boolean: " + boolObj + " (unboxed: " + bool + ")");
        System.out.println("Boolean parse: " + Boolean.parseBoolean("true"));


        // String conversions
        System.out.println("\n--- String Conversions ---");
        String intStr = Integer.toString(123);
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("Integer->String: " + intStr);
        System.out.println("String->Integer: " + parsedInt);

        // Wrapper class methods
        System.out.println("\n--- Useful Methods ---");
        System.out.println("Double compare: " + Double.compare(10.5, 20.2));
        System.out.println("Character toLowerCase: " + Character.toLowerCase('Z'));
    }
}