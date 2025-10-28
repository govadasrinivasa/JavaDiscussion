package com.jt.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {

	public static void main(String[] args) {
        // Define the expected date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // An invalid date string that doesn't match the format
        String invalidDateString = "2023/01/01";

        try {
            // Attempt to parse the invalid date string
            Date date = dateFormat.parse(invalidDateString);
            System.out.println("Parsed date: " + date);
        } catch (ParseException pe) {
            // Catch the ParseException and handle it
            System.err.println("Error parsing date: " + pe.getMessage());
            pe.printStackTrace(); // Print the stack trace for debugging
        }

        // A valid date string that matches the format
        String validDateString = "2024-12-25";
        try {
            Date date = dateFormat.parse(validDateString);
            System.out.println("Successfully parsed date: " + date);
        } catch (ParseException pe) {
            System.err.println("Error parsing date: " + pe.getMessage());
        }
    }

}
