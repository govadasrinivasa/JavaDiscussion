package com.jt;

//Generic Class
class Box<T> {
 private T value;

 public Box(T value) {
     this.value = value;
 }

 public T getValue() {
     return value;
 }

 public void setValue(T value) {
     this.value = value;
 }
}


//Generic Interface
interface Container<T> {
 void show(T item);
}

class DisplayContainer<T> implements Container<T> {
 public void show(T item) {
     System.out.println("Container item: " + item);
 }
}


//Bounded Type (Upper Bound)
class NumberPrinter<T extends Number> {
 public void printDouble(T num) {
     System.out.println("Double value: " + num.doubleValue());
 }
}


//Generic Method
class Utility {
 public static <T> void printArray(T[] array) {
     for (T element : array) {
         System.out.print(element + " ");
     }
     System.out.println();
 }
}


//Main class showing all features
public class GenericsDemo {
 public static void main(String[] args) {

     System.out.println("----- 1. GENERIC CLASS -----");
     Box<String> strBox = new Box<>("Hello");
     Box<Integer> intBox = new Box<>(100);

     System.out.println("String Box: " + strBox.getValue());
     System.out.println("Integer Box: " + intBox.getValue());


     System.out.println("\n----- 2. GENERIC INTERFACE -----");
     Container<String> c1 = new DisplayContainer<>();
     c1.show("Java Generics Demo");

     Container<Integer> c2 = new DisplayContainer<>();
     c2.show(123);


     System.out.println("\n----- 3. BOUNDED TYPE (extends Number) -----");
     NumberPrinter<Integer> np1 = new NumberPrinter<>();
     np1.printDouble(50);

     NumberPrinter<Double> np2 = new NumberPrinter<>();
     np2.printDouble(99.99);


     System.out.println("\n----- 4. GENERIC METHOD -----");
     String[] names = {"A", "B", "C"};
     Integer[] numbers = {1, 2, 3, 4};

     Utility.printArray(names);
     Utility.printArray(numbers);


     System.out.println("\n----- 5. WILDCARDS -----");

     // ? → Unknown type
     Box<?> unknownBox = new Box<>("Wildcard Box");
     System.out.println("Unknown Box value: " + unknownBox.getValue());

     // ? extends Number → read-only numbers
     Box<? extends Number> numBox = new Box<>(123);
     System.out.println("Upper bounded wildcard: " + numBox.getValue());

     // ? super Integer → can store Integers or its super types
     Box<? super Integer> superBox = new Box<>(999);
     superBox.setValue(500);
     System.out.println("Lower bounded wildcard: " + superBox.getValue());


     System.out.println("\n----- 6. TYPE SAFETY -----");
     // Box<String> str = new Box<>(10);   // ❌ Compile-time error
     // str.setValue(20);                 // Prevents wrong type assignment
     System.out.println("Generics provide compile-time type checking.");
 }
}