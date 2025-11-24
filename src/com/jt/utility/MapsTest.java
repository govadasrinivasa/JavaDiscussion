package com.jt.utility;

import java.util.*;

public class MapsTest {

    public static void main(String[] args) {

        // ---------------------------------------------
        // 1. MAP EXAMPLE (HashMap)
        // ---------------------------------------------
        System.out.println("=== MAP EXAMPLE (HashMap) ===");

        Map<Integer, String> map = new HashMap<>();
        map.put(103, "Laptop");
        map.put(101, "Mobile");
        map.put(102, "Tablet");
        map.put(104, "Smart Watch");

        // Display using entrySet + iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check if key exists
        if (map.containsKey(102)) {
            System.out.println("\nProduct with ID 102 exists: " + map.get(102));
        }

        // Remove a key
        map.remove(104);
        System.out.println("After removal: " + map);


        // ---------------------------------------------
        // 2. SORTEDMAP EXAMPLE (TreeMap)
        // ---------------------------------------------
        System.out.println("\n=== SORTEDMAP EXAMPLE (TreeMap) ===");

        SortedMap<String, Integer> priceMap = new TreeMap<>();

        priceMap.put("Laptop", 55000);
        priceMap.put("Watch", 15000);
        priceMap.put("Mobile", 25000);
        priceMap.put("Tablet", 35000);

        // Keys are automatically sorted alphabetically
        for (Map.Entry<String, Integer> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("First Key  : " + priceMap.firstKey());
        System.out.println("Last Key   : " + priceMap.lastKey());


        // ---------------------------------------------
        // 3. NAVIGABLEMAP EXAMPLE (TreeMap)
        // ---------------------------------------------
        System.out.println("\n=== NAVIGABLEMAP EXAMPLE (TreeMap) ===");

        NavigableMap<Integer, String> scoreMap = new TreeMap<>();

        scoreMap.put(50, "John");
        scoreMap.put(70, "Asha");
        scoreMap.put(85, "Ravi");
        scoreMap.put(90, "Priya");

        // Display full map
        System.out.println("Scores: " + scoreMap);

        // NavigableMap operations
        System.out.println("Lower Key (<85): " + scoreMap.lowerKey(85));
        System.out.println("Higher Key (>85): " + scoreMap.higherKey(85));
        System.out.println("Floor Key (<=85): " + scoreMap.floorKey(85));
        System.out.println("Ceiling Key (>=85): " + scoreMap.ceilingKey(85));

        // Submaps
        System.out.println("\nHeadMap (<70): " + scoreMap.headMap(70));
        System.out.println("TailMap (>=70): " + scoreMap.tailMap(70));
        System.out.println("SubMap (70 to 90): " + scoreMap.subMap(70, true, 90, true));

        // Reverse order
        System.out.println("\nDescending Order: " + scoreMap.descendingMap());
    }
}
