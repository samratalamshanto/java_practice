package com.practice.class_object_project;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        //map----hashmap-----put(key, value)
        Map<String ,Integer> mp = new HashMap<>();
        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);

        //override the value
        mp.put("three",23);

        //check the key is present or not?

        mp.putIfAbsent("two",20); // if not present then added
        if(!mp.containsKey("two"))
        {
            mp.put("two",20);
        }

        System.out.println(mp);




    }
}
