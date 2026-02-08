//package com.jt;
//
//import static org.junit.Assert.*;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runners.Suite.SuiteClasses;
//
//public class CustomerOrderProcessingTest {
//
//
//	Billing billing = null;
//	Order order = null;
//	Customer customer = null;
//	
//	@Before
//	public void setUp() throws Exception {
//        customer = new Customer("Rahul Sharma", "1234567890", "abc@gmail.com", "Pune", "", 1000.00, 'M');
//        order = new Order(501, "Laptop", 2, 45000.0);
//        billing = new Billing();
//        
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		
//	}
//
//	@Test
//	public void testCreate() {
//		double billAmount = billing.calculateBill(order);
//		System.out.println("===== CUSTOMER DETAILS =====");
//        System.out.println(customer);
//
//        System.out.println("\n===== ORDER DETAILS =====");
//        System.out.println(order);
//
//        System.out.println("\n===== BILL DETAILS =====");
//        System.out.println("Total Amount: " + billAmount);
//
//        System.out.println("\n===== PROCESS PAYMENT =====");
//	}
//
//	@Test
//	public void testDisplayBill() {
//		billing.payBill(customer, order);
//	}
//}