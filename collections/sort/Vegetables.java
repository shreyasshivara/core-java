package com.xworkz.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Vegetables {
    public static void main(String[] args) {
        List<String> veg=new ArrayList<>();
        veg.add("tomato");
        veg.add("potato");
        veg.add("onion");
        veg.add("drumstick");
        veg.add("soaBeans");
        veg.add("chilli");
        veg.add("cucumber");
        veg.add("ginger");
        veg.add("corn");
        veg.add("carrot");
        Collections.sort(veg);
        for (String ref:veg
             ) {
            System.out.println(ref);

        }

        Comparator<String> comparator=new VegComparator();
        System.out.println("=============After dess=========");
        Collections.sort(veg,comparator);
        for (String ref:veg
             ) {
            System.out.println(ref);

        }


    }
}
