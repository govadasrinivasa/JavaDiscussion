package com.jt.utility;

import java.util.*;

public class CustomerSorter {

 // Method to sort based on the selected field
 public static void sortCustomers(Vector<Customers> customers, int choice) {

     switch (choice) {
         case 1:
             Collections.sort(customers, Comparator.comparing(Customers::getCustomerName));
             break;

         case 2:
//             Collections.sort(customers, Comparator.comparing(Customers::getAddress));
             break;

         case 3:
             Collections.sort(customers, Comparator.comparingInt(Customers::getCustomerId));
             break;

         case 4:
             Collections.sort(customers, Comparator.comparing(Customers::getPlan));
             break;

         case 5:
             Collections.sort(customers, Comparator.comparingLong(Customers::getMobileNumber));
             break;

         default:
             System.out.println("Invalid choice!");
             return;
     }
 }

 public static void main(String[] args) {

     Vector<Customers> customers = new Vector<>();

     customers.add(new Customers("Ravi", new Address("101","Kukatpally","Hyderabad","500072"), 103, "Gold", 9876543210L));
     customers.add(new Customers("Anjali", new Address("102","Andheri","Mumbai","400005"), 101, "Silver", 9988776655L));
     customers.add(new Customers("Kiran", new Address("103","OMR","Chennai","600012"), 102, "Platinum", 9123456780L));
     customers.add(new Customers("Deepak", new Address("104","Yelahanka","Bengalurur","500045"), 104, "Gold", 9087654321L));

     Scanner sc = new Scanner(System.in);

     System.out.println("Sort Customers By:");
     System.out.println("1. Customer Name");
     System.out.println("2. Address");
     System.out.println("3. Customer ID");
     System.out.println("4. Plan");
     System.out.println("5. Mobile Number");
     System.out.print("Enter choice: ");

     int choice = sc.nextInt();

     // Sort based on selected option
     sortCustomers(customers, choice);

     // Display using Enumeration
     System.out.println("\nSorted Customer List:");
     Enumeration<Customers> en = customers.elements();
     while (en.hasMoreElements()) {
         System.out.println(en.nextElement());
     }

     sc.close();
 }
}

//Customer class with required fields
class Customers {
	private String customerName;
	private Address address;
	private int customerId;
	private String plan;
	private long mobileNumber;
	
	public Customers(String customerName, Address address, int customerId, String plan, long mobileNumber) {
	   this.customerName = customerName;
	   this.address = address;
	   this.customerId = customerId;
	   this.plan = plan;
	   this.mobileNumber = mobileNumber;
	}
	
	public String getCustomerName() {
	   return customerName;
	}
	
	public Address getAddress() {
	   return address;
	}
	
	public int getCustomerId() {
	   return customerId;
	}
	
	public String getPlan() {
	   return plan;
	}
	
	public long getMobileNumber() {
	   return mobileNumber;
	}

	@Override
	public String toString() {
	   return "Customer [Name=" + customerName + ", Address=" + address + 
	          ", ID=" + customerId + ", Plan=" + plan +
	          ", Mobile=" + mobileNumber + "]";
	}
}
class Address {
	private String hno;
	private String street;
	private String city;
	private String pin;
	
	public Address(String hno, String street, String city, String pin ) {
		this.hno=hno;
		this.street=street;
		this.city=city;
		this.pin=pin;
	}
}