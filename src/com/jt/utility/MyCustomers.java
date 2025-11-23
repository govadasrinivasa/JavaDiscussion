package com.jt.utility;

public class MyCustomers implements Comparable<MyCustomers> {

	 private String customerName;
	 private String address;
	 private int customerId;
	 private String plan;
	 private long mobileNumber;
	 
	public MyCustomers(String customerName, String address, int customerId, String plan, long mobileNumber) {
	     this.customerName = customerName;
	     this.address = address;
	     this.customerId = customerId;
	     this.plan = plan;
	     this.mobileNumber = mobileNumber;
	}
	
	 @Override
	 public String toString() {
	     return "MyCustomer [Name=" + customerName +
	            ", Address=" + address +
	            ", ID=" + customerId +
	            ", Plan=" + plan +
	            ", Mobile=" + mobileNumber + "]";
	 }
	
	@Override
	public int compareTo(MyCustomers o) {
		return this.address.compareTo(o.address);
	}

}
