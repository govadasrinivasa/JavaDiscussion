package com.jt;

public class SuperTest {

	public static void main(String[] args) {
		CDisplay cd = new CDisplay();
		cd.display();
	}

}
class PDisplay {
	String name;
	void display() {
		System.out.println("This is display method in Parent class");
	}
}
class CDisplay extends PDisplay {
	String name;
	void display() {
		System.out.println("This is display method in Child class");
	}
}