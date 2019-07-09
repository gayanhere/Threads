package com.gayan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortByValue {

    //this map store unsorted values
    static Map <String,Integer> map = new HashMap<>();
    //function to sort map by key
    public  static  void sortbykey(){
        //treemap to store valyues of hashmap
        TreeMap<String ,Integer> sorted = new TreeMap<>();
        //copy all data from hashmap to treemap
        sorted.putAll(map);

        LinkedHashMap<Integer,String> sortedMap = new LinkedHashMap<>();
        //display the vale which is naturally sorted
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getValue(),x.getKey()));
        System.out.println(sortedMap);

    }

    public static void main(String[] args) {
        //putting values in map
        map.put("Saman",79);
        map.put("Kamal",45);
        map.put("Nimal",65);
        map.put("Sunil",34);
        map.put("Amara",23);

        //calling the function sortbykey
        sortbykey();
    }

}


