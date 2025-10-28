package com.jt;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition addition = new Addition();
		addition.add(20, 30);
		addition.add("Pune", "Maharashtra");
		addition.add(0, 0);
	}

}
class Addition {
	
	void add() {
		System.out.println(2+5);
	}
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	
	int add(int a) {
		System.out.println(a+10);
		return a+10;
	}
	
	void add(int a, float b) {
		System.out.println(2+5);
	}
	
	void add(int a, long b) {
		System.out.println(2+5);
	}
	
	void add(float a, int b) {
		System.out.println(2+5);
	}
	
	void add(float x, float y) {
		System.out.println(x+y);
	}
	
	void add(float x) {
		System.out.println(x+10.0f);
	}
	
	void add(String x, String y) {
		System.out.println(x+y); // Concatenation
	}
}