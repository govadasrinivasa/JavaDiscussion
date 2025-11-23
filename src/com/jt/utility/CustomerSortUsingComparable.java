package com.jt.utility;

import java.util.*;

//Customer class implementing Comparable
class MyCustomer implements Comparable<MyCustomer> {

 private String customerName;
 private String address;
 private int customerId;
 private String plan;
 private long mobileNumber;

 public MyCustomer(String customerName, String address, int customerId, String plan, long mobileNumber) {
     this.customerName = customerName;
     this.address = address;
     this.customerId = customerId;
     this.plan = plan;
     this.mobileNumber = mobileNumber;
 }

 public String getCustomerName() { return customerName; }
 public String getAddress() { return address; }
 public int getCustomerId() { return customerId; }
 public String getPlan() { return plan; }
 public long getMobileNumber() { return mobileNumber; }

 // Natural ordering: sort by customerName
 @Override
 public int compareTo(MyCustomer other) {
     return this.customerName.compareTo(other.customerName);

     // 👉 To sort by other fields, replace the above line with:
     // return this.address.compareTo(other.address);  // Sort by address
     // return Integer.compare(this.customerId, other.customerId);  // Sort by ID
     // return this.plan.compareTo(other.plan);        // Sort by plan
     // return Long.compare(this.mobileNumber, other.mobileNumber); // Sort by mobile
 }

 @Override
 public String toString() {
     return "Customer [Name=" + customerName +
            ", Address=" + address +
            ", ID=" + customerId +
            ", Plan=" + plan +
            ", Mobile=" + mobileNumber + "]";
 }
}

public class CustomerSortUsingComparable {

 public static void main(String[] args) {

     List<MyCustomers> list = new ArrayList<>();
//
//     list.add(new MyCustomer("Ravi", "Hyderabad", 103, "Gold", 9876543210L));
//     list.add(new MyCustomer("Anjali", "Mumbai", 101, "Silver", 9988776655L));
//     list.add(new MyCustomer("Kiran", "Chennai", 102, "Platinum", 9123456780L));
//     list.add(new MyCustomer("Deepak", "Bangalore", 104, "Gold", 9087654321L));
//
//     // Sorting using Comparable (natural sorting)
//     Collections.sort(list);
//
//     System.out.println("\nSorted Customer List (Using Comparable):");
//     for (MyCustomer c : list) {
//         System.out.println(c);
//     }
	 
       list.add(new MyCustomers("Ravi", "Hyderabad", 103, "Gold", 9876543210L));
	   list.add(new MyCustomers("Anjali", "Mumbai", 101, "Silver", 9988776655L));
	   list.add(new MyCustomers("Kiran", "Chennai", 102, "Platinum", 9123456780L));
	   list.add(new MyCustomers("Deepak", "Bangalore", 104, "Gold", 9087654321L));
	   Collections.sort(list);
	   
     System.out.println("\nSorted Customer List (Using Comparable):");
     for (MyCustomers c : list) {
         System.out.println(c);
     }
 }
}

