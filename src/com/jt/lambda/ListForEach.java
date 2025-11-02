package com.jt.lambda;

public class ListForEach {

	public static void main(String args[]) {
		Customer customer[] = new Customer[10];
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