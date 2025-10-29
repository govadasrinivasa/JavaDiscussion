package com.jt.exception;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) throws Exception {
		
		MyExceptionTest myexception = new MyExceptionTest();
		myexception.myMethod();
        
		try {
			throwMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	static void catchMethod() {
        
		FileWriter writer = null; // Declare writer outside try block for finally access

        System.out.println("Inside try block.");
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, Java 21!"); 
        } catch(IOException e) {
        	
        }
        System.out.println("Program finished.");
    }
	
	static void throwMethod() throws IOException { 
        
		FileWriter writer = null; // Declare writer outside try block for finally access

        System.out.println("Inside try block.");
        writer = new FileWriter("output.zip");
        writer.write("Hello, Java 21!"); 
        System.out.println("Program finished.");
    }

}
