package com.jt;

public class CustomersTest {

	public static void main(String[] args) {
		CustomerA A = new CustomerA();
		A.getA();
		CustomerB B = new CustomerB();
		B.getA();
	}

}
class CustomerA{
	void getA() {
		
	}
}

class CustomerB extends CustomerA {
void getB() {
		
	}
}