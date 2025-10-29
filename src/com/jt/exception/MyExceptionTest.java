package com.jt.exception;

import java.io.IOException;

public class MyExceptionTest extends Exception {

	
    void myMethod() throws IOException { 
        
//		FileWriter writer = null; // Declare writer outside try block for finally access

        System.out.println("Inside try block.");
//        writer = new FileWriter("output.zip");
//        writer.write("Hello, Java 21!"); 
        System.out.println("Program finished.");
    }
    
    void myMethodNoException() { 
        
//		FileWriter writer = null; // Declare writer outside try block for finally access

        System.out.println("Inside try block.");
//        writer = new FileWriter("output.zip");
//        writer.write("Hello, Java 21!"); 
        System.out.println("Program finished.");
    }
}
