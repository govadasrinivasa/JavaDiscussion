package com.jt;
/*
 * re usability
 * 1. Single Inheritance
 * 2. Multiple Inheritance // Java supports indirectly
 * 3. Multilevel Inheritance
 * 4. Hierarchical Inheritance
 */
public class SingleInheritanceTest {

	public static void main(String[] args) {
		ParentCalculation pc = new ParentCalculation();
		pc.add();
		pc.multiply();
		
		System.out.println();
		ChildCalculation cc = new ChildCalculation();
		cc.add();
		cc.multiply();
		cc.substract();
		
		Addtion add = new Addtion();
		add.add();
		
		Substraction sub = new Substraction();
		sub.add();
		sub.substract();
		
		Multiplication mul = new Multiplication();
		mul.add();
		mul.substract();
		mul.multiply();
		
		Division div = new Division();
		div.add();
		div.substract();
		div.multiply();
		div.divide();
	}

}

class ParentCalculation{
	void add () {
		System.out.println("This is addition in ParentCalculation");
	}
	
	void multiply() {
		System.out.println("This is multiplication in ParentCalculation");
	}
}

class ChildCalculation extends ParentCalculation {
	void substract() {
		System.out.println("This is substraction in ChildCalculation");
	}
}

// Multilevel Inheritance

class Addtion {
	void add () {
		System.out.println("This is addition in Addtion");
	}
}
class Substraction extends Addtion {
	void substract() {
		System.out.println("This is substraction in Substraction");
	}
}
class Multiplication extends Substraction {
	void multiply() {
		System.out.println("This is multiplication in Multiplication");
	}
}
class Division extends Multiplication {
	void divide() {
		System.out.println("This is divide in Division");
	}
}