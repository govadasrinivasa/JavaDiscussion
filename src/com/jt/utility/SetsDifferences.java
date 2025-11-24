package com.jt.utility;

import java.util.*;

public class SetsDifferences {
    public static void main(String[] args) {

        // ---------------------------
        // 1. TreeSet
        // ---------------------------
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet (Always sorted): " + treeSet);


        // ---------------------------
        // 2. SortedSet (Interface)
        //    TreeSet implements SortedSet
        // ---------------------------
        SortedSet<Integer> sortedSet = new TreeSet<>(treeSet);

        System.out.println("\nSortedSet (headSet, tailSet, subSet available): ");
        System.out.println("HeadSet (< 25): " + sortedSet.headSet(25));
        System.out.println("TailSet (>= 25): " + sortedSet.tailSet(25));
        System.out.println("SubSet (10 to 30): " + sortedSet.subSet(10, 30));


        // ---------------------------
        // 3. NavigableSet (Interface)
        //    TreeSet also implements NavigableSet
        // ---------------------------
        NavigableSet<Integer> navigableSet = new TreeSet<>(treeSet);

        System.out.println("\nNavigableSet (extra navigation methods):");
        System.out.println("Lower(25): " + navigableSet.lower(25));     // < 25
        System.out.println("Floor(25): " + navigableSet.floor(25));     // <= 25
        System.out.println("Ceiling(25): " + navigableSet.ceiling(25)); // >= 25
        System.out.println("Higher(25): " + navigableSet.higher(25));   // > 25

        System.out.println("Descending Set: " + navigableSet.descendingSet());

        System.out.println("Poll First (remove smallest): " + navigableSet.pollFirst());
        System.out.println("Poll Last (remove largest): " + navigableSet.pollLast());

        System.out.println("NavigableSet after poll: " + navigableSet);
    }
}

