package com.jt.designpatterns.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "RectangleforClone";
	}
	
	@Override
	void draw() {
		System.out.println("Inside RectangleforClone:draw method.");
	}

}
