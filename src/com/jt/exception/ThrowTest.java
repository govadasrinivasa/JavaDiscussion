package com.jt.exception;

public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second sec = new Second();
		sec.calculate(10);
	}

}

class First {
	
	double getResult(int x) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		return 100/x;
	}
}
class Second {
	First f = new First();
	double calculate(int x) {
		double d = 0;
		try {
		d =  f.getResult(5);
		System.out.println(d);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}finally {
			System.out.println("mandatory block");
		}
		return d;
	}
}