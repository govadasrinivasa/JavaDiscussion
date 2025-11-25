package com.jt;

public class HotelOrder {

    private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public HotelOrder(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
               ", Product: " + productName +
               ", Quantity: " + quantity +
               ", Price: " + price;
    }
}
