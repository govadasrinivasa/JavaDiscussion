package com.jt.exception;

public class MultiCatchTest {

	public static void main(String[] args) {
        try {
            String text = args[0];
            System.out.println(text.length()); // This will cause NullPointerException

            int value = Integer.parseInt("abc"); // This will cause NumberFormatException
        } catch (NullPointerException | NumberFormatException e) {
            System.err.println("An error related to data processing occurred: " + e.getMessage());
            // Common handling logic for both NullPointerException and NumberFormatException
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
