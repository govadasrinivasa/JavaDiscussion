package com.jt.designpatterns.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
		
		Shape shape1 = shapeFactory1.getShape("rectangle");
		shape1.draw();
		
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
		
		Shape shape2 = shapeFactory2.getShape("square");
		shape2.draw();
		
	}

}
