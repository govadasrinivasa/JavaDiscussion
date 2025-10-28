package com.jt;

public interface HighSchool {

	void getMaths() ;
	void getScience();
	void getArts();
	
	default void display() {
		System.out.println("This is default");
	}
	static void show() {
		System.out.println("This is show");
	}
}
