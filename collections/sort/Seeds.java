package com.xworkz.collections.sort;

import java.util.*;

public class Seeds {
    public static void main(String[] args) {


        List<String> seeds = new ArrayList<>();
        seeds.add("Flaxseeds");
        seeds.add("Hemp Seeds");
        seeds.add("Pumpkin Seeds");
        seeds.add("Poppy Seeds");
        seeds.add("Sunflower Seeds");
        seeds.add("Chia Seeds");
        seeds.add("Sesame Seeds");
        seeds.add("Pine Nuts");
        seeds.add("Flaxseeds");
        seeds.add("Flaxseeds");
        Collections.sort(seeds);
        System.out.println("============== Asc sorted list");
        for (String val :seeds
                ) {
            System.out.println(val);

        }

       Comparator<String> comparator=new SeedComparator();
        System.out.println("after dess");
       Collections.sort(seeds,comparator);
        for (String val:seeds
             ) {
            System.out.println(val);

        }

    }
}
