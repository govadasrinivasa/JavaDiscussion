package com.jt.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsTest {

    public static void main(String[] args) {
        ThrowsTest example = new ThrowsTest();

//        try {
//            example.processFile("data.txt"); // Valid case
//            example.processFile("nonexistent.txt"); // Will throw FileNotFoundException
//            example.processFile("corrupted.txt"); // Will throw IOException
//            example.processFile(""); // Will throw IllegalArgumentException (unchecked)
//        } catch (FileNotFoundException e) {
//            System.err.println("Caught FileNotFoundException: " + e.getMessage());
//        } catch (IOException e) {
//            System.err.println("Caught IOException: " + e.getMessage());
//        } catch (IllegalArgumentException e) { // Catching unchecked exception
//            System.err.println("Caught IllegalArgumentException: " + e.getMessage());
//        } catch (Exception e) { // General catch for any other unexpected exceptions
//            System.err.println("Caught a general exception: " + e.getMessage());
//        }
        
        try {
            example.processFile("data.txt"); // Valid case
            example.processFile("nonexistent.txt"); // Will throw FileNotFoundException
            example.processFile("corrupted.txt"); // Will throw IOException
            example.processFile(""); // Will throw IllegalArgumentException (unchecked)
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Caught IOException or IllegalArgumentException: " + e.getMessage());
        } 
        catch (Exception e) { // General catch for any other unexpected exceptions
            System.err.println("Caught a general exception: " + e.getMessage());
        }
    }
    
    public void processFile(String filePath) throws FileNotFoundException, IOException {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        // Simulate a FileNotFoundException
        if (filePath.equals("nonexistent.txt")) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        // Simulate an IOException (e.g., during reading/writing)
        if (filePath.equals("corrupted.txt")) {
            throw new IOException("Error reading from file: " + filePath);
        }

        System.out.println("Processing file: " + filePath);
        // ... actual file processing logic ...
    }

}
