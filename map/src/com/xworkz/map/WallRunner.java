package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WallRunner {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("China wall","yello");
        map.put(" wall of cricket","godi banna sadarana mykattu");
        map.put("wooden","yelllow");
        map.put("Cement","blue");
        map.put("POP","blue");
        Set<String> key=map.keySet();
        key.forEach(r-> System.out.println(r));
        System.out.println("=====================================");
        Collection<String> value=map.values();
        value.forEach(r-> System.out.println(r));
    }
}
