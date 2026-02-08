package com.jt.designpatterns.abstractfactory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside the method Square:draw()");
	}

}