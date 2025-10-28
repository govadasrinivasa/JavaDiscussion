package com.jt;

public class ConditionalTest {

	public static void main(String[] args) {
		int a = 12;
		int b = 22;
		int c =5;
		
		int marks = 66;
		int myrank =2;
		
		/*
		 * if(condition){
		 *  business logic which is of multiple lines
		 * }
		 * if(condition)
		 *  business logic which is of single line

		 */
		// if condition
		if (a < b) {
			System.out.println(b-a);
		}
		
		if (a < b) {
			System.out.println("a is lesserthan b");
			System.out.println(b-a);
		}
		
		// if-else condition
		if (c < b) 
			System.out.println(b-c);
		else
			System.out.println(c-b);
		
		if (c < b) {
			System.out.println("c is lesserthan b");
			System.out.println(b-c);
		}
		else {
			System.out.println("c is greaterthan b");
			System.out.println(c-b);
		}
		
		// if-else ladder
		if(marks < 40)
			System.out.println("Failed");
		else if(marks > 40  && marks < 60)
			System.out.println("Passed in second class");
		else if(marks > 60 )
			System.out.println("Passed in First class");
		else
			System.out.println("Passed in Distinction");
		
		// Nested if
		/*
		 * if(){
			 * 	if(){
				 * 	if() {
				 * 	}
			 * }
		 * }
		 */
		
		if(marks > 40) {
			if(marks > 40  && marks < 60)
				System.out.println("Passed in second class");
			else if(marks > 60 )
				System.out.println("Passed in First class");
			else
				System.out.println("Passed in Distinction");
		}else
			System.out.println("Failed");
		
		// switch statement
		
		switch(myrank) {
			case 1:
				System.out.println("Passed in Distinction");
				break;
			case 2:
				System.out.println("Passed in First class");
				break;
			case 3:
				System.out.println("Passed in second class");
				break;
			default:
				System.out.println("Failed");
		}
		
	}

}
