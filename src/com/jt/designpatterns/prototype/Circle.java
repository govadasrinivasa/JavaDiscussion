package com.jt.designpatterns.prototype;

public class Circle extends Shape {

	public Circle() {
		type = "CircleforClone";
	}
	
	@Override
	void draw() {
		System.out.println("Inside CircleforClone:draw method.");
	}

}
