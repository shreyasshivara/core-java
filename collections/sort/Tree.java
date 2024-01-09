package com.xworkz.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        List<Integer> age=new ArrayList<>();
        age.add(6);
        age.add(7);
        age.add(8);
        age.add(9);
        age.add(10);
        age.add(11);
        age.add(12);
        age.add(13);
        age.add(14);
        age.add(15);
        Collections.sort(age);
        System.out.println("after ass====================");
        for (Integer ref:age
             ) {
            System.out.println(ref);


        }
        Comparator<Integer> compare=new TreeComparator();
        Collections.sort(age,compare);
        System.out.println("After desccc==================");
        for (Integer ref:age
             ) {
            System.out.println(ref);

        }
    }
}
