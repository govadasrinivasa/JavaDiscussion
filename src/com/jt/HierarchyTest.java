package com.jt;

public class HierarchyTest {

	public static void main(String[] args) {
		GH gh = new GH();
		gh.display();
		gh.show();
	}

}
	
interface GP{	
	default void display() {
		
	}
	
}
interface P1 extends GP{
	default void show() {
		System.out.println("Show method in interface P1");
	}
}

interface P2 extends GP{
	default void show() {
		System.out.println("Show method in interface P2");
	}
}

class GH implements P1, P2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		P2.super.show();
	}
	
}