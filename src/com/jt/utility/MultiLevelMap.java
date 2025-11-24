package com.jt.utility;

import java.util.*;

public class MultiLevelMap {
    public static void main(String[] args) {

        Map<String, Map<String, Integer>> countryMap = new HashMap<>();

        // Add data
        countryMap.put("India", new HashMap<>());
        countryMap.get("India").put("Mumbai", 20000000);
        countryMap.get("India").put("Delhi", 18000000);

        countryMap.put("USA", new HashMap<>());
        countryMap.get("USA").put("New York", 8500000);
        countryMap.get("USA").put("Los Angeles", 4000000);

        // 1. Print all countries
        System.out.println("Countries:");
        for (String country : countryMap.keySet()) {
            System.out.println(country);
        }

        // 2. Print each country and its cities
        System.out.println("\nCountry -> Cities:");
        for (String country : countryMap.keySet()) {
            System.out.println("\n" + country + ":");
            Map<String, Integer> cities = countryMap.get(country);

            for (String city : cities.keySet()) {
                System.out.println("  " + city + " : " + cities.get(city));
            }
        }

        // 3. Print total population per country
        System.out.println("\nTotal Population per Country:");
        for (String country : countryMap.keySet()) {
            int totalPop = countryMap.get(country)
                    .values()
                    .stream()
                    .mapToInt(i -> i)
                    .sum();

            System.out.println(country + " -> " + totalPop);
        }

    }
}
