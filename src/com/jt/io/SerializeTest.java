package com.jt.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest {

	public static void main(String[] args) {
		
		Address address = new Address("Bangalore", "India");
        Employee emp = new Employee(101, "John Doe", 90000.50, address);

        //try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
        try {
        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(emp);
            System.out.println("✅ Object Serialized Successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
class Address implements Serializable {
	private static final long serialVersionUID = 2L;
	String city;
	String country;

	public Address(String city, String country) {
		this.city = city;
	    this.country = country;
	}
}

class Employee implements Serializable {

	private static final long serialVersionUID = 1L; // Version control

	private int id;
	private String name;
	private transient double salary;  // transient will NOT be serialized
	private static String company = "Tech Corp"; // static → not stored per object
	private Address address; // Nested serializable object

	public Employee(int id, String name, double salary, Address address) {
		this.id = id;
	    this.name = name;
	    this.salary = salary;
	    this.address = address;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
	            ", name='" + name + '\'' +
	            ", salary=" + salary +   // will become 0.0 after deserialization
	            ", company='" + company + '\'' +
	            ", address=" + address.city + ", " + address.country +
	    '}';
	}
}