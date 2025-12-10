package com.jt.junit;

import java.util.Date;

public class Billing {

    private static final double TAX_RATE = 0.18; // 18% GST

    public double calculateBill(Order order) {
    	 Date date = new Date();
    	 System.out.println(date);
        return order.calculateItemsTotal();
    }

    public double applyTax(double billAmount) {
        return billAmount + (billAmount * TAX_RATE);
    }

    public double applyDiscount(double finalAmount, double discountPercent) {
        return finalAmount - (finalAmount * (discountPercent / 100));
    }

    public double generateFinalBill(Order order, double discount) {
        double bill = calculateBill(order);
        double billWithTax = applyTax(bill);
        return applyDiscount(billWithTax, discount);
    }
}