package com.jt;

public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Vehicle();
		Car c = new Car();
		c.getVehiclename();
	}

}
abstract class Vehicle {
	String vehiclename;
	
	void displayVehicleData() {
		System.out.println();
	}
	
	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}



	abstract void setVehicleType(String name);
}

class Car extends Vehicle {

	String carName;
	
	@Override
	void setVehicleType(String name) {
		// TODO Auto-generated method stub
		vehiclename = name;
	}
	
}