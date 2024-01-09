package com.xworkz.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Toll {
    public static void main(String[] args) {
        List<Double> cost=new ArrayList<>();
        cost.add(45d);
        cost.add(55d);
        cost.add(65d);
        cost.add(75d);
        cost.add(85d);
        cost.add(95d);
        cost.add(44d);
        cost.add(54d);
        cost.add(55d);
        cost.add(45d);
        Collections.sort(cost);
        System.out.println("After desc");
        for (Double ref:cost
             ) {
            System.out.println(ref);

        }
        Comparator<Double> desc=new TollComparator();
        System.out.println("=======after desss");
        Collections.sort(cost,desc);
        for (Double ref:cost
             ) {
            System.out.println(ref);

        }
    }
}
