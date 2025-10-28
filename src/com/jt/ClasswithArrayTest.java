package com.jt;

public class ClasswithArrayTest {

	public static void main(String[] args) {
		
		Students[] student = new Students[2];
		
		for(int i=0;i<student.length;i++) {
			student[i] = new Students();
			student[i].setName("abcd");
			student[i].setGender('M');
			student[i].setRno("qewr43");
			student[i].setClassname("BSc");
			student[i].setMaths(28);
			student[i].setChemistry(44);
			student[i].setPhysics(67);
		}
		
		for(int i=0;i<student.length;i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getGender()+"\t");
			System.out.print(student[i].getRno()+"\t");
			System.out.print(student[i].getClassname()+"\t");
			System.out.println();
		}
		
		calculateGrade(student);
		calculateGrade(student);
	}
	
	static void calculateGrade(Students student[]) {
		int marks = 0;
		for(int i=0;i<student.length;i++) {
			marks = student[i].getChemistry()+student[i].getPhysics()+student[i].getMaths();
		}
		displayGrade(marks);
	}
	
	static void displayGrade(int marks) {
		
		if(marks < 40)
			System.out.println("Failed");
		else if(marks > 40  && marks < 60)
			System.out.println("Passed in second class");
		else if(marks > 60 )
			System.out.println("Passed in First class");
		else
			System.out.println("Passed in Distinction");
		}
	}

class Students {
	String name;
	String rno;
	char gender;
	String classname;
	int physics;
	int maths;
	int chemistry;
	
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRno() {
		return rno;
	}
	public void setRno(String rno) {
		this.rno = rno;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
}