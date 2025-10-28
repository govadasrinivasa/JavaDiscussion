package com.jt;

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motherboard mb1 = new Motherboard();
		Motherboard mb2 = new Motherboard("Dell","10");
		System.out.println();
	}

}

class Computers {
	
	String brandName;
	
	public Computers(String brandName) {
		this.brandName = brandName;
	}
	public Computers() {
		// TODO Auto-generated constructor stub
	}
}

class Motherboard extends Computers {
	
	String capacity;
	
	public Motherboard(String capacity, String brandName) {
		this.capacity = capacity;
		super.brandName = brandName;
	}
	public Motherboard() {
		// TODO Auto-generated constructor stub
	}
}