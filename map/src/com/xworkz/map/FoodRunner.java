package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FoodRunner {
    public static void main(String[] args) {
        Map<String , String[]> map=new HashMap<>();
        String[] muddeIngrediants={"ragi malt", "salt","Water"};
        String[] nonvegfoodIngrediants={"meat", "ginger garloic paste","onion","tomato"};
        map.put("bellulli kabab",nonvegfoodIngrediants);
        map.put("mudde",muddeIngrediants);
        map.put("mutton samber",nonvegfoodIngrediants);
        map.put("chicken samber",nonvegfoodIngrediants);
        map.put("biriyani",nonvegfoodIngrediants);

        Set<String> key=map.keySet();
        key.forEach(r-> System.out.println(r));
        System.out.println("==================================");
        Collection<String[]> values=map.values();
        values.forEach(r-> System.out.println(r));
    }
}
