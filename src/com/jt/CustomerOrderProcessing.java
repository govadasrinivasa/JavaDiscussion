package com.jt;

public class CustomerOrderProcessing {

//    public static void main(String[] args) {
	
    HotelCustomer customer = null;
    HotelOrder order = null;
    HotelBilling billing = null;

    	void create() {
    		// Create customer
            customer = new HotelCustomer(101, "Rahul Sharma", "Mumbai");

            // Create order
            order = new HotelOrder(501, "Laptop", 2, 45000.0);

            // Billing
            billing = new HotelBilling();
    	}
    	
    	void displayBill() {
    		double billAmount = billing.calculateBill(order);

            System.out.println("===== CUSTOMER DETAILS =====");
            System.out.println(customer);

            System.out.println("\n===== ORDER DETAILS =====");
            System.out.println(order);

            System.out.println("\n===== BILL DETAILS =====");
            System.out.println("Total Amount: " + billAmount);

            System.out.println("\n===== PROCESS PAYMENT =====");
            billing.payBill(customer, order);
    	}
//    }
}
