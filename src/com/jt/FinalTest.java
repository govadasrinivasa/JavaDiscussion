package com.jt;

public class FinalTest {

	public static void main(String[] args) {
		ChildofGP childofGP = new ChildofGP();
		childofGP.getFinalDetails();
		
		GParent gp;
		
		Customer cust = new Customer();
	}

}
class GParent {
	
	void getFinalDetails() {
		System.out.println("Final method in GParent");
	}
	
	void getDetails() {
		System.out.println("Non Final method");
	}
}
class ChildofGP extends GParent{
	void getChildDetails() {
		System.out.println("Child method");
	}
	
	void getFinalDetail() {
		System.out.println("Final method in ChildofGP");
	}
	
	void getDetails() {
		System.out.println("Non Final method");
	}
}