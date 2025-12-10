package com.jt;

import java.util.Date;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating Customer Objects");
		Customer customer1 = new Customer();
		Customer customer4;
		
		customer1.setCname("Srinivas");
		customer1.setEmail("abc@gmail.com");
		customer1.setMobile("4324325443");
		customer1.setAddress("Pune");
		
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		//customer4.getAddress();
		
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
	String transactionType;
	double billAmount;
	char gender;

	public Customer(String cname, String mobile, String email, String address, String transactionType, double billAmount, char gender) {
		
		this.cname=cname;
		this.mobile=mobile;
		this.email=email;
		this.address=address;
		this.transactionType=transactionType;
		this.billAmount=billAmount;
		this.gender=gender;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
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
	
	public double calculateBill(Order order) {
        return order.calculateTotal();
    }

    public void payBill(Customer customer, Order order) {
        System.out.println("----- BILL PAYMENT -----");
        System.out.println(customer);
        System.out.println(order);
        System.out.println("Total Bill Amount: " + calculateBill(order));
        System.out.println("Payment Successful!");
    }
    Integer i = Integer.valueOf(1000);
    int ii = i;
    Integer iii = ii;
}

