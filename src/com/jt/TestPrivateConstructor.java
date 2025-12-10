package com.jt;

public class TestPrivateConstructor {

	public static void main(String args[]) {
		MyConstructor myConstructor = MyConstructor.callPrivate();
		myConstructor.setName("Ramu");
		myConstructor.setAge(22);
		myConstructor.setPlace("Hyderabad");
		MyConstructor myConstructor2 = MyConstructor.callPrivate();
		
//		myConstructor.callDisplay(myConstructor);
	}
}
class MyConstructor {
	private String name;
	private int age;
	private String place;
	
	static MyConstructor myConstructor = null;

	private MyConstructor() {
		// TODO Auto-generated constructor stub
	}
	
	static MyConstructor callPrivate() {
		if(myConstructor == null) {
			myConstructor = new MyConstructor();
		}
		return myConstructor;
	}
	
//	void callDisplay(MyConstructor m) {
//		m.display();
//	}
//
//	private void display() {
//		System.out.println(this.getName());
//		System.out.println(this.getAge());
//		System.out.println(this.getPlace());
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
}