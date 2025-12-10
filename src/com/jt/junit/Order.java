package com.jt.junit;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Item> items = new ArrayList<>();

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateItemsTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public List<Item> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderId() {
        return orderId;
    }
}
