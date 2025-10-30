package com.jt;

public class CallbyRefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers customer = new Customers("Girish","1234567890","Chennai");
		System.out.println(customer.getName());
		modifyCustomer(customer);
		System.out.println(customer.getName());
	}

	static void modifyCustomer(Customers o) {
        o.setName("Ramesh"); // Changes the state of the object pointed to by both references
    }
}

class Customers {
	
	String name;
	String mobile;
	String place;
	
	public Customers(String name, String mobile, String place) {
		this.name=name;
		this.mobile=mobile;
		this.place=place;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}