package com.jt;

public class Order {

    private int orderId;
    private String productName;
    private int quantity;
    private double price;

    public Order(int orderId, String productName, int quantity, double price) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public Order() {
		// TODO Auto-generated constructor stub
	}
    
    public int getOrderId() {
		return orderId;
	}

	private void setOrderId(int orderId) {
		this.orderId = orderId;
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

