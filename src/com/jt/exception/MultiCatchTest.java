package com.jt.exception;

import java.io.IOException;

public class MultiCatchTest {

	public static void main(String[] args) {
        try {
            String text = args[0];
            System.out.println(text.length()); // This will cause NullPointerException

            int value = Integer.parseInt("abc"); // This will cause NumberFormatException
        }
//        catch (NullPointerException e) {
//            System.err.println("An error related to data processing occurred: " + e.getMessage());
//        }
//        catch (NumberFormatException e) {
//            System.err.println("An error related to data processing occurred: " + e.getMessage());
//        }
        catch (NullPointerException | NumberFormatException | ArithmeticException e) {
            System.err.println("An error related to data processing occurred: " + e.getMessage());
        } 
        catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
