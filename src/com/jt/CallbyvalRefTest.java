package com.jt;

public class CallbyvalRefTest {

	static int x = 10;
	public static void main(String[] args) {
		Student stu = new Student("Shyam");
		System.out.println(" " +x);
		updateStudent(stu,x);
		System.out.print(stu.getName());
		System.out.println(" " +x);
	}

	static void updateStudent(Student stu, int a) {
		stu.setName("Ram");
		a+=20; // x=x+20
	}
	
}

class Student {
	
	private String name;
	
	public Student(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}