package com.jt.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0/100);
		int x[] = {15,3,7,8,3};
		String str = "Pune";
		try {
			System.out.println(Double.parseDouble(str));
			System.out.println(100/0);	
			for(int i=0;i<10;i++)
				System.out.println(x[i]);
		}catch(ArithmeticException ae) {
			System.out.println("ArithmeticException Exception"+ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("ArrayIndexOutOfBoundsException Exception"+aiob.getMessage());
		}catch(NumberFormatException aiob) {
			System.out.println("NumberFormatException Exception"+aiob.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Common Exception");
		}
	}

}
