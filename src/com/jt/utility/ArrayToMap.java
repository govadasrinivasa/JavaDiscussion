package com.jt.utility;

import java.util.*;

public class ArrayToMap {
    public static void main(String[] args) {

        String[] keys = {"A", "B", "C", "D"};
        Integer[] values = {10, 20, 30, 40};

        if (keys.length != values.length) {
            System.out.println("Arrays must have the same length!");
            return;
        }

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        System.out.println("Map created from Arrays:");
        System.out.println(map);
    }
}
