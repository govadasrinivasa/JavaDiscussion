package com.jt.sunil;

public class Parent1 {

	private String privatemem = "Private Member";
	String defaultmem = "Default Member";
	protected String protectedmem = "Protected Member";
	public String publicmem = "Public Member";
	
	void showParent1Members() {
		System.out.println(privatemem);
		System.out.println(defaultmem);
		System.out.println(protectedmem);
		System.out.println(publicmem);
	}
}

class Test {
	
	void test() {
		Parent1 p = new Parent1();
		//System.out.println(p.privatemem);
		System.out.println(p.defaultmem);
		System.out.println(p.protectedmem);
		System.out.println(p.publicmem);
	}	
}
