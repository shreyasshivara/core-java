package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.RefillDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillDtoRunner {
    public static void main(String[] args) {
        RefillDto refillDto=new RefillDto("blue",10,"writometer",false);
        RefillDto refillDto1=new RefillDto("red",15,"renaulds",true);
        RefillDto refillDto2=new RefillDto("green",5,"cello",false);
        RefillDto refillDto3=new RefillDto("black",8,"mastro",true);
        RefillDto refillDto4=new RefillDto("blue",11,"apsara",false);
        List<RefillDto> list=new ArrayList<>();
        list.add(refillDto1);
        list.add(refillDto2);
        list.add(refillDto3);
        list.add(refillDto4);
        list.add(refillDto);
        Comparator<RefillDto> comparator=new RefillDtoColourComparatorAsc();
        System.out.println("After asc=====================");
        Collections.sort(list,comparator);
        for (RefillDto ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator1=new RefillDtoColourComparatorDesc();
        System.out.println("After desc=====================");
        Collections.sort(list,comparator1);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator2=new RefillDtoBrandComparatorAsc();
        System.out.println("After asc=====================");
        Collections.sort(list,comparator2);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator3=new RefillDtoBrandComparatorDesc();
        System.out.println("After desc=====================");
        Collections.sort(list,comparator3);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator4=new RefillDtoReusableComparatorAsc();
        System.out.println("After asc=====================");
        Collections.sort(list,comparator4);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator5=new RefillDtoReusableComparatorDesc();
        System.out.println("After desc=====================");
        Collections.sort(list,comparator5);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator6=new RefillDtoCostComparatorAsc();
        System.out.println("After asc=====================");
        Collections.sort(list,comparator6);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<RefillDto> comparator7=new RefillDtoCostComparatorAsc();
        System.out.println("After asc=====================");
        Collections.sort(list,comparator7);
        for (RefillDto ref:list
        ) {
            System.out.println(ref);
        }
    }

}
