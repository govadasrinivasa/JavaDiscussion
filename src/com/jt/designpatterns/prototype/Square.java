package com.jt.designpatterns.prototype;

public class Square extends Shape {

	public Square() {
		type = "SquareforClone";
	}
	
	@Override
	void draw() {
		System.out.println("Inside SquareforClone:draw method.");
	}

}
