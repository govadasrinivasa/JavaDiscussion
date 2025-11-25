package com.jt;

public class HotelBilling {

    public double calculateBill(HotelOrder order) {
        return order.calculateTotal();
    }

    public void payBill(HotelCustomer customer, HotelOrder order) {
        System.out.println("----- BILL PAYMENT -----");
        System.out.println(customer);
        System.out.println(order);
        System.out.println("Total Bill Amount: " + calculateBill(order));
        System.out.println("Payment Successful!");
    }
}
