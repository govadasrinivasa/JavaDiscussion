package com.jt.junit;

public class RestaurantSystem {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Ravi Kumar", "9876543210");

        Order order = new Order(101, customer);
        order.addItem(new Item("Pizza", 250, 2));
        order.addItem(new Item("Pasta", 150, 1));
        order.addItem(new Item("Coke", 40, 3));

        Billing billing = new Billing();

        double billAmount = billing.calculateBill(order);
        double finalAmount = billing.generateFinalBill(order, 10); // 10% discount

        System.out.println("===== CUSTOMER DETAILS =====");
        System.out.println(customer);

        System.out.println("\n===== ORDER DETAILS =====");
        for (Item item : order.getItems()) {
            System.out.println(item);
        }

        System.out.println("\nTotal Items Amount: " + billAmount);
        System.out.println("Final Amount (with tax & discount): " + finalAmount);
    }
}