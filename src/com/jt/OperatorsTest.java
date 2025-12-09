package com.jt;

import java.util.ArrayList;
import java.util.List;

public class OperatorsTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Order order = new Order();
		Employee emp = new Employee();
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(emp);
		
		List elements = new ArrayList();
		elements.add("Srinivas");
		elements.add(101);
		
		// TODO Auto-generated method stub
		
		String city = "PUNE";
		String mycity = "pune";
		
		if(city =="pune" || city == "PUNE" )
			System.out.println(true);
		
		int x= 10;
		System.out.println(x++); // postfix
		System.out.println(x);
		
		int y= 10;
		System.out.println(++y);
		
		int marks = 60;
		
		boolean passed = (marks > 60) ? true: false;
		System.out.println(passed);
	}
}
class Employee {
	private String empName;
	private String empId;
	private double salary;
	private String dept;
	private char gender;
	private String age;
}
