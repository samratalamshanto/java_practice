package com.practice.class_object_project;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        //map----hashmap-----put(key, value)---O(1)
        Map<String, Integer> mp = new HashMap<>();
        mp.put("one", 1);
        mp.put("two", 2);
        mp.put("three", 3);

        //override the value
        mp.put("three", 23);

        //check the key is present or not?

        mp.putIfAbsent("two", 20); // if not present then added
        //contains
        if (!mp.containsKey("two")) {
            mp.put("two", 20);
        }

        System.out.println(mp.containsValue(2));

        System.out.println(mp);

        System.out.println();
        //iterator map #####
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String s : mp.keySet()) System.out.println(s);
        for (Integer i : mp.values()) System.out.println(i);


        //map--- TreeMap ---- ordered by keys ---O(n)
        Map<String, Integer>mp2 = new TreeMap<>();
        mp2.put("one",1);
        mp2.put("two",2);
        mp2.put("five",5);

        System.out.println(mp2); //five one two--- ordered by keys

        mp2.remove("two");
        System.out.println(mp2);
    }
}
