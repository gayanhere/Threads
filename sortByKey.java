package com.gayan;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortByKey {

       static Map<String,Integer> map = new HashMap<>();


        //function to sort map by key
        public static void sortbykey()
        {
            TreeMap<String,Integer> sorted = new TreeMap<>();
        sorted.putAll(map);

        for (Map.Entry<String,Integer>entry : sorted.entrySet())
            System.out.println("name = " + entry.getKey() + ", marks = " + entry.getValue());
        }

    public static void main(String[] args) {
        map.put("Gayan",90);
        map.put("Kamal",45);
        map.put("Nimal",65);
        map.put("Sunil",34);
        map.put("Amara",23);

        sortbykey();
    }


    }

