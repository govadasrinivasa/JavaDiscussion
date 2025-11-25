package com.jt;

public class HotelCustomer {

    private int customerId;
    private String name;
    private String address;

    public HotelCustomer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
               ", Name: " + name +
               ", Address: " + address;
    }
}
