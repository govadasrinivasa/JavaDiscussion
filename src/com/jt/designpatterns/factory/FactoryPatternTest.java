package com.jt.designpatterns.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
	}

}
