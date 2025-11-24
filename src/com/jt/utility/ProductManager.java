package com.jt.utility;

import java.util.*;

//class Product {
//
//    private String productName;
//    private String category;
//    private double price;
//    private int productId;
//    private double rating;
//
//    public Product(String productName, String category, double price, int productId, double rating) {
//        this.productName = productName;
//        this.category = category;
//        this.price = price;
//        this.productId = productId;
//        this.rating = rating;
//    }
//
//    public String getProductName() { return productName; }
//    public String getCategory() { return category; }
//    public double getPrice() { return price; }
//    public int getProductId() { return productId; }
//    public double getRating() { return rating; }
//
//    @Override
//    public String toString() {
//        return "Product [Name=" + productName +
//               ", Category=" + category +
//               ", Price=" + price +
//               ", ID=" + productId +
//               ", Rating=" + rating + "]";
//    }
//}

public class ProductManager {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        // Initial Products
        products.add(new Product("Laptop", "Electronics", 75000, 103, 4.5));
        products.add(new Product("Shoes", "Footwear", 2500, 101, 4.0));
        products.add(new Product("Mobile", "Electronics", 45000, 102, 4.7));
        products.add(new Product("Watch", "Accessories", 5000, 104, 3.9));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== PRODUCT MENU =====");
            System.out.println("1. Add New Product");
            System.out.println("2. Remove Product on Sale (by Product ID)");
            System.out.println("3. Sort Products");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addNewProduct(products, sc);
                    break;
                case 2:
                    removeProductOnSale(products, sc);
                    break;
                case 3:
                    sortProducts(products, sc);
                    break;
                case 4:
                    displayProducts(products);
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    // ---------------------- ADD PRODUCT ----------------------
    public static void addNewProduct(List<Product> products, Scanner sc) {
        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Category: ");
        String category = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        products.add(new Product(name, category, price, id, rating));
        System.out.println("Product Added Successfully!");
    }

    // ---------------------- REMOVE PRODUCT ----------------------
    public static void removeProductOnSale(List<Product> products, Scanner sc) {
        System.out.print("Enter Product ID to remove (Sale): ");
        int id = sc.nextInt();

        boolean removed = products.removeIf(p -> p.getProductId() == id);

        if (removed)
            System.out.println("Product Removed Successfully!");
        else
            System.out.println("Product Not Found!");
    }

    // ---------------------- SORT PRODUCTS ----------------------
    public static void sortProducts(List<Product> products, Scanner sc) {

        System.out.println("\nSort Products By:");
        System.out.println("1. Product Name");
        System.out.println("2. Category");
        System.out.println("3. Price");
        System.out.println("4. Product ID");
        System.out.println("5. Rating");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                products.sort((p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));
                break;
            case 2:
                products.sort((p1, p2) -> p1.getCategory().compareTo(p2.getCategory()));
                break;
            case 3:
                products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
                break;
            case 4:
                products.sort((p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
                break;
            case 5:
                products.sort((p1, p2) -> Double.compare(p1.getRating(), p2.getRating()));
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nProducts Sorted Successfully!");
        displayProducts(products);
    }

    // ---------------------- DISPLAY USING ENUMERATION ----------------------
    public static void displayProducts(List<Product> products) {

        System.out.println("\n======= PRODUCT LIST =======");

        Enumeration<Product> en = Collections.enumeration(products);

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}

