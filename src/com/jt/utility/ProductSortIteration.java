package com.jt.utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductSortIteration {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Laptop", "Electronics", 75000, 103, 4.5));
        list.add(new Product("Shoes", "Footwear", 2500, 101, 4.0));
        list.add(new Product("Mobile", "Electronics", 45000, 102, 4.7));
        list.add(new Product("Watch", "Accessories", 5000, 104, 3.9));

        Scanner sc = new Scanner(System.in);

        System.out.println("Sort Products By:");
        System.out.println("1. Product Name");
        System.out.println("2. Category");
        System.out.println("3. Price");
        System.out.println("4. Product ID");
        System.out.println("5. Rating");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                list.sort((p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));
                break;

            case 2:
                list.sort((p1, p2) -> p1.getCategory().compareTo(p2.getCategory()));
                break;

            case 3:
                list.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
                break;

            case 4:
                list.sort((p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));
                break;

            case 5:
                list.sort((p1, p2) -> Double.compare(p1.getRating(), p2.getRating()));
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Convert List to Enumeration using Collections.enumeration()
        Iterator<Product> iter = list.iterator();
        while(iter.hasNext()) {
        	System.out.println(iter.next());
        }

        sc.close();
    }
}