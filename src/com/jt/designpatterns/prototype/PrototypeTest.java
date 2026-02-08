package com.jt.designpatterns.prototype;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		ShapeCache.loadCache();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");	
		System.out.println("Shape : "+ clonedShape1.getType());
	
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");	
		System.out.println("Shape : "+ clonedShape2.getType());
		
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");	
		System.out.println("Shape : "+ clonedShape3.getType());
		
		Circle c1 = new Circle();
		Circle c2 = c1;
		
		System.out.println(clonedShape1.getClass().getName());
		System.out.println(clonedShape2.getClass().getName());
		System.out.println(clonedShape3.getClass().getName());
	}

}
