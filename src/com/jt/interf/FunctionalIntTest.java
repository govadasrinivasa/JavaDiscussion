package com.jt.interf;

public class FunctionalIntTest {

	public static void main(String[] args) {
		
		Caculation sum  = (num1, num2) -> num1 + num2; 
		System.out.println("Addition: " + sum.cal(10, 5));
		
		Caculation sub  = (num1, num2) -> num1 - num2; 
		System.out.println("Substraction: " + sub.cal(10, 5));
		
		Caculation mul  = (num1, num2) -> num1 * num2; 
		System.out.println("Multiplication: " + mul.cal(10, 5));
		
		MyDetails details  = (me) -> System.out.println("Name: "+me);; 
		details.showMyDetails("Vishnu");
	}

}

@FunctionalInterface
interface Caculation {
	int cal (int a, int b);
}

@FunctionalInterface
interface MyDetails {
    void showMyDetails(String message);
}