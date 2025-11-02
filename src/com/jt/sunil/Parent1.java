package com.jt.sunil;

public class Parent1 {

	private String privatemem = "Private Member";
	String defaultmem = "Default Member";
	protected String protectedmem = "Protected Member";
	public String publicmem = "Public Member";
	
	public void showParent1Members() {
		System.out.println(privatemem);
		System.out.println(defaultmem);
		System.out.println(protectedmem);
		System.out.println(publicmem);
	}
}
