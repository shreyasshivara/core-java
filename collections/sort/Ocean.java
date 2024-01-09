package com.xworkz.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ocean {
    public static void main(String[] args) {
        List<String> ocean= new ArrayList<>();
        ocean.add("Atlantic Ocean");
        ocean.add("Indian Ocean");
        ocean.add("Antarctic Ocean");
        ocean.add("Arctic Ocean");
        ocean.add("Coral Sea");
        ocean.add("South China Sea");
        ocean.add("Pacific Ocean");
        ocean.add("Arabian Sea");
        ocean.add("Caribbean Sea");
        Collections.sort(ocean);
        for (String ref:ocean
             ) {
            System.out.println(ref);

        }
        Comparator<String> comparator=new OceanComparator();
        System.out.println("============after desss==========");
        Collections.sort(ocean,comparator);
        for (String ref:ocean
             ) {
            System.out.println(ref);
        }
    }

}
