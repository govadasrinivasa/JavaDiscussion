package com.jt;

public class ControlStmtTest {

	public static void main(String[] args) {
		
		/*
		 *  for loop
		 *  syntax for(initialization;condition;increment/decrement){} 
		 */
		// declaration or initialization
		int x=10;
		for(int i=0;i<=10;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int ii=0;ii<=10;++ii) {
			System.out.print(ii+"\t");
		}
//		
//		for(int i=10;i>=0;i--) {
//			System.out.println(i);
//		}
		
		/*
		 * while loop
		 * syntax while(condition){}
		 */
//		while(x<10){
//			System.out.println(x);
//			x++;
//		};
		
		/*
		 * do-while loop
		 * syntax do {}while(condition
		 */
//		do {
//			System.out.println(x);
//		}while(x<10);
		
		// dynamic declaration or dynamic initialization
//		double y = 10.35;
//		boolean ischecked = false;
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("Inner loop \t outer loop");	
	}

}
