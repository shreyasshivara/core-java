package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LandRunner {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("Farming land","Shreyas");
        map.put("commercial land","Shreyas");
        map.put("empty land","Shreyas");
        map.put("waste land","Shreyas");
        Set<String > key= map.keySet();
        key.forEach(r-> System.out.println(r));
        System.out.println("==============================");
        Collection<String> values=map.values();
    }
}
