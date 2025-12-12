package com.general;

//Sealed class declaration
sealed abstract class Shapes permits Circles, Square, Rectangle, Hexagon {
 // Common behavior or abstract methods for all shapes
 public abstract double area();
}

//Permitted subclass: final
final class Circles extends Shapes {
 private final double radius;

 public Circles(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Permitted subclass: non-sealed
non-sealed class Square extends Shapes {
 private final double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 public double area() {
     return side * side;
 }
}

//Permitted subclass: final
final class Rectangle extends Shapes {
 private final double width;
 private final double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double area() {
     return width * height;
 }
}

final class Hexagon extends Shapes{

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

//Example usage
public class SealedTest {
 public static void main(String[] args) {
     Shapes circle = new Circles(5.0);
     Shapes square = new Square(4.0);
     Shapes rectangle = new Rectangle(3.0, 6.0);

     System.out.println("Circle area: " + circle.area());
     System.out.println("Square area: " + square.area());
     System.out.println("Rectangle area: " + rectangle.area());
     
     Thread t = new Thread();
 }
}
