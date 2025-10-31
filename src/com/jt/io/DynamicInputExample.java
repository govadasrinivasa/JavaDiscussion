package com.jt.io;

import java.util.Scanner;

public class DynamicInputExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		System.out.println("Enter your place");
		String place = scanner.nextLine();
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Place: "+ place);
	}

}
