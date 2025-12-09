package com.general;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//File: ParameterizedRecordExample.java

//A record representing a Product with an explicit parameterized constructor

   class Products {
    
	String name;
    double price;
  	String category;
  	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
  
  }
record Product(String name, double price, String category) {

 // Explicit canonical (parameterized) constructor
 public Product(String name, double price, String category) {

     // Custom validation logic
     if (price < 0) {
         throw new IllegalArgumentException("Price cannot be negative");
     }

     // Assigning values to record components
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Custom method
 public String info() {
     return "Product: " + name + " | Price: ₹" + price + " | Category: " + category;
 }
}

public class RecordTest {
 public static void main(String[] args) {

     // Creating record object using parameterized constructor
     Product product1 = new Product("Laptop", 75000.50, "Electronics");

     // Displaying values
     System.out.println(product1.info());

     // Using auto-generated toString()
     System.out.println(product1);

     // Accessor methods
     System.out.println("Name: " + product1.name());
     System.out.println("Price: " + product1.price());
     System.out.println("Category: " + product1.category());
     
     Product product2 = new Product("Laptop", 75000.50, "Computers");
     
     System.out.println(product1.hashCode());
     System.out.println(product2.hashCode());
     System.out.println((product1.equals(product2)) || (product1 == product2));
     
     Products pp = new Products();
     Class cla =pp.getClass();
     Field[] fields = cla.getDeclaredFields();
     Method[] methods = cla.getDeclaredMethods();
     
     for(int i=0;i<fields.length;i++) {
    	 System.out.println(fields[i]); 
     }
     for(int i=0;i<methods.length;i++) {
    	 System.out.println(methods[i]); 
     }
 }
}
