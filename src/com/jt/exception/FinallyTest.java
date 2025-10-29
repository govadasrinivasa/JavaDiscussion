package com.jt.exception;

import java.io.FileWriter;
import java.io.IOException;

public class FinallyTest {

	public static void main(String[] args) {
        FileWriter writer = null; // Declare writer outside try block for finally access

        try {
        	String text = args[0];
            System.out.println(text.length()); 
            
            System.out.println("Inside try block.");
            writer = new FileWriter("output.txt");
            writer.write("Hello, Java 21!"); 
        } catch (IOException e) {
            System.err.println("Caught an IOException:"+e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Caught an NullPointerException:"+e.getMessage());
        }finally {
            System.out.println("Inside finally block.");
            if (writer != null) {
                try {
                    writer.close();
                    System.out.println("FileWriter closed successfully.");
                } catch (IOException e) {
                    System.err.println("Error closing FileWriter: " +e.getMessage());
                }
            } else {
                System.out.println("FileWriter was not initialized or already closed.");
            }
        }
        System.out.println("Program finished.");
    }


}
