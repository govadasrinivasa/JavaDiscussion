package com.jt;

public class OperatorsTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// logical 
		// > < >= <= 
		// relational
		// == !=
		// arithmetic
		// + - % / *
		// conditional
		// && ||
		// assignment
		// += -= ++ --
		// Postfix - ++ --
		// Prefix ++ -- 
		// ternary
		// ?
		
//		if("RAJA" == "raja") {
//			System.out.println(true);
//		}else if("RAJA" != "raja") {
//			System.out.println(false);
//		}
		
		String city = "PUNE";
		String mycity = "pune";
		
		if(city =="pune" || city == "PUNE" )
			System.out.println(true);
		
		int x= 10;
		System.out.println(x++); // postfix
		System.out.println(x);
		
		int y= 10;
		System.out.println(++y);
		
		int marks = 60;
		
		boolean passed = (marks > 60) ? true: false;
		System.out.println(passed);
	}
	
	

}
