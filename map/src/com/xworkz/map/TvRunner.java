package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TvRunner {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("LED","MI");
        map.put("4K LED","MI");
        map.put("QLED","MI");
        map.put("OLED","MI");
        map.put("Black&white","MI");
        Set<String> key=map.keySet();
        key.forEach(r-> System.out.println(r));
        System.out.println("======================================================");
        Collection<String> value=map.values();
        value.forEach(r-> System.out.println(r));
    }
}
