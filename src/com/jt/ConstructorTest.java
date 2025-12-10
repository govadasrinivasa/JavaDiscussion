package com.jt;

import java.io.BufferedInputStream;
import java.lang.*;

/*
 * Constructors Test
 * 1. Default Constructor
 * 2. Parameterized Constructor
 * 3. Copy Constructor
 * 
 *  Constructors are methods with no return type and called automatically only once
 */
public class ConstructorTest {

	public static void main(String[] args) {
		MyStudents stu1 = new MyStudents();
		MyStudents stu2 = new MyStudents(11, "Ramu", 'M');
		MyStudents stu3 = new MyStudents(stu2);
		
		MyClass mc = new MyClass("BSc", 11, "Subhash", 'M');
		MyClass mc2 = new MyClass();
		MyClass mc3 = new MyClass(mc2);
		System.out.println();
		
		BufferedInputStream bufferedInputStream = new BufferedInputStream(null);
		
		//Overriding
		
		// instance or concrete object
		MyStudents myStudents = new MyStudents(11, "Ramu", 'M');
		
		// reference object
		MyStudents ms;
		MyClass myClass = new MyClass("BSc", 11, "Subhash", 'M');
		
		ms = myStudents;
		ms.displayStudents();
		
		System.out.println();
		System.out.println();
		
		ms = myClass;
		ms.displayStudents();
	}

}
class MyStudents {
	// variable
	int rno;
	String name;
	char gender;
	final String collegeName = "JNTU";

	void displayStudents() {
		//System.out.println("className = "+className);
		System.out.println("Roll No = "+rno);
		System.out.println("Stu Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("College Name = "+collegeName);
	}
	
	MyStudents(){
		
	}
	
	MyStudents(MyStudents m){
		rno = m.getRno();
		name = m.getName();
		gender = m.getGender();
	}
	
	MyStudents(int rno, String name, char gender){
		this.rno = rno;
		this.name =name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}
	
}

class MyClass extends MyStudents {
	String className;
	
	public MyClass(String className, int rno, String name, char gender){
		// TODO Auto-generated constructor stub
		//super(rno, name, gender);
		this.className = className;
		super.rno = rno;
		super.name = name;
		super.gender = gender;
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	public MyClass(MyClass m) {
		// TODO Auto-generated constructor stub
		super(m);
		this.className = m.getClassName();
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	void displayStudents() {
		System.out.println("className = "+className);
		System.out.println("Roll No = "+rno);
		System.out.println("Stu Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("College Name = "+collegeName);
	}
}