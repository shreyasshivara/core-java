package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SparkPlugDto;
import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugDtoRunner {
    public static void main(String[] args) {
        SparkPlugDto sparkPlugDto=new SparkPlugDto("bosch",200,"white","bikes");
        SparkPlugDto sparkPlugDto1=new SparkPlugDto("ngk",250,"black","cars");
        SparkPlugDto sparkPlugDto2=new SparkPlugDto("denso",300,"blue","bikes");
        SparkPlugDto sparkPlugDto3=new SparkPlugDto("E3",150,"yellow","cars");
        SparkPlugDto sparkPlugDto4=new SparkPlugDto("champion",190,"white","bikes");
        List<SparkPlugDto> list=new ArrayList<>();
        list.add(sparkPlugDto);
        list.add(sparkPlugDto1);
        list.add(sparkPlugDto2);
        list.add(sparkPlugDto3);
        list.add(sparkPlugDto4);
        Comparator<SparkPlugDto> comparator=new SparkPlugDtoBrandComparatorAsc();
        System.out.println("After asc========================");
        Collections.sort(list,comparator);
        for (SparkPlugDto ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator1=new SparkPlugDtoBrandComparatorDesc();
        System.out.println("After desc========================");
        Collections.sort(list,comparator1);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator2=new SparkPlugDtoCostComparatorAsc();
        System.out.println("After asc========================");
        Collections.sort(list,comparator2);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator3=new SparkPlugDtoCostComparatorDesc();
        System.out.println("After asc========================");
        Collections.sort(list,comparator3);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator4=new SparkPlugDtoUsedforComparatorAsc();
        System.out.println("After asc========================");
        Collections.sort(list,comparator4);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator5=new SparkPlugDtoUsedforComparatorDesc();
        System.out.println("After Desc========================");
        Collections.sort(list,comparator5);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator6=new SparkPlugDtoColourComparatorAsc();
        System.out.println("After asc========================");
        Collections.sort(list,comparator6);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<SparkPlugDto> comparator7=new SparkPlugDtoColourComparatorDesc();
        System.out.println("After desc========================");
        Collections.sort(list,comparator7);
        for (SparkPlugDto ref:list
        ) {
            System.out.println(ref);
        }


    }
}
