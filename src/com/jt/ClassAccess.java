package com.jt;

public class ClassAccess {

	public String cname; // fields or members
	private String mobile;
	String email;
	
	public static void main(String[] args) {
		ClassAccess customer = new ClassAccess();
//		customer.setMobile(234324);
		customer.cname = "";
		customer.email = "";
		customer.mobile = "324324324";
	}

}