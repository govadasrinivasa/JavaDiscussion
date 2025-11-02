package com.jt;

public interface Animal {

	void sound();
	
	void music();
	
	default void show() {
		
	}
	
	static void display() {
		
	}
}
