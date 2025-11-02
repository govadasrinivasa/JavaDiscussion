package com.jt;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Dog d = new Dog(); // instance object d
		Cat c = new Cat(); // instance object c
		Cow cow = new Cow(); // instance object cow
		
		Dog dd; // reference object d
		Cat cc; // reference object c
		Cow cows; // reference object cow
		
		Animal a; // reference object
		a = d;
		a.sound();
		
		a = c;
		a.sound();
		
		a = cow;
		a.sound();
	}

}

class Dog implements Animal {
	
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("Cat meows");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cow implements Animal {

	@Override
	public void sound() {
		System.out.println("Cow moos");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		
	}
	
}
