package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShirtRunner {
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();
        map.put("Half arm shirt","Peter England");
        map.put("full arm shirt","van hussein");
        map.put("cotton shirt","US polo ");
        map.put("white shirt","CK");
        map.put("Chainees collor shirt","Barbare");
        Set<String> key=map.keySet();
        key.forEach(r-> System.out.println(r));
        System.out.println("===========================================");
        Collection<String> value=map.values();
        value.forEach(r-> System.out.println(r));



    }
}
