package com.jt.exception;

import java.util.EmptyStackException;
import java.util.Stack;

public class ThrowTest {

	public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        // Attempting to pop from an empty stack will throw EmptyStackException
        try {
            System.out.println("Attempting to pop from an empty stack...");
            if(myStack.size() == 0)
            	throw new EmptyStackException(); // This line will throw EmptyStackException
            else
            	myStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException: " + e.getMessage());
        }

        // Pushing some elements onto the stack
        myStack.push("First Element");
        myStack.push("Second Element");
        System.out.println("Stack after pushing elements: " + myStack);

        // Popping elements successfully
        try {
            String poppedElement = myStack.pop();
            System.out.println("Popped: " + poppedElement);
            poppedElement = myStack.pop();
            System.out.println("Popped: " + poppedElement);
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException during valid pops: " + e.getMessage());
        }

        // Attempting to peek at an empty stack
        try {
            System.out.println("Attempting to peek at an empty stack...");
            if(myStack.size() == 0)
            	throw new EmptyStackException(); // This line will throw EmptyStackException
            else
            	myStack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Caught EmptyStackException when peeking: " + e.getMessage());
        }
    }
}