package com.jt;

import java.lang.Math;
import java.util.Date;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Customer Objects");
		Customer customer1 = new Customer();
		
		customer1.setCname("Srinivas");
		customer1.setEmail("abc@gmail.com");
		customer1.setMobile("4324325443");
		customer1.setAddress("Pune");
		
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		System.out.println();
		Billing billing = new Billing();
		System.out.println();
	}

}

class Customer { // Parent class
	
	String cname; // fields or members
	String mobile;
	String email;
	String address;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
// Billing is child class
class Billing extends Customer {
	String product;
	int qty;
	double price;
	Date doe;
}
