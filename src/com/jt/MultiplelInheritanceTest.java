package com.jt;

public class MultiplelInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
class Parent1 {
	void showParent1() {
		System.out.println("This is Parent1 class");
		System.out.println("This is Parent1 class");
		System.out.println("This is Parent1 class");
	}
}
interface Parent2 {
	void showParent2() ;
}

interface Parent3 {
	void showParent3() ;
}

interface Ch1 {
	void getHyd();
}

interface Ch2 {
	void getPune();
}

interface Ch3 extends Ch2, Ch1 {
	void getBengaluru();
}

class Student1 implements Ch1 {

	@Override
	public void getHyd() {
		// TODO Auto-generated method stub
		// Charminar, birla
	}
	
}
// child can have more than one parent interface
class Student2 extends Parent1 implements Ch1, Ch2, Ch3 {

	@Override
	public void getHyd() {
		// TODO Auto-generated method stub
		// Hitech, Hussain 
	}

	@Override
	public void getBengaluru() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPune() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Computer {
	void setMotherboardP();
	void setCPU();
	void setGraphicsCard();
	void setProcessor();
}

class HP implements Computer {

	@Override
	public void setMotherboardP() {
		
	}

	@Override
	public void setCPU() {
		
	}

	@Override
	public void setGraphicsCard() {
		
	}

	@Override
	public void setProcessor() {
		
	}
	
}
class Dell implements Computer {

	@Override
	public void setMotherboardP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCPU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGraphicsCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProcessor() {
		// TODO Auto-generated method stub
		
	}
	
}
class ABC implements Computer {

	@Override
	public void setMotherboardP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCPU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGraphicsCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setProcessor() {
		// TODO Auto-generated method stub
		
	}
	
}