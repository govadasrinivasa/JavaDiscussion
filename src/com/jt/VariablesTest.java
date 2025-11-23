package com.jt;

public class VariablesTest {

	 String stuName; // Global variable
	 static String city = "Hyderabad"; // global static variable
	 
	 
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		VariablesTest.city = city;
	}

	public VariablesTest(String stuName) {
		this.stuName= stuName;
	}
	public static void main(String[] args) {
		 double salary;
//		 System.out.println(str1);
		 System.out.println(city);
		 
		 VariablesTest v1 = new VariablesTest("Raju");
		 v1.localTest();
		 
		 VariablesTest v2 = new VariablesTest("Rani");
		 v2.localTest();
		 VariablesTest.classlevelMeth();
	}
	
	void localTest() {
		System.out.println();
		String str2 = "Local variable";
		System.out.println(str2);
		System.out.println(stuName);
	}
	
	void globalTest() {
		stuName = "Global variable";
		System.out.println(stuName);
	}
	
	public static void classlevelMeth() {
		 double salary;
	}

}