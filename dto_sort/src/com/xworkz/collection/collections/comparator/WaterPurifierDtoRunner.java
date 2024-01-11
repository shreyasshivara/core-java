package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.comparator.WaterPurifierDtoBrandComparatorAsc;
import com.xworkz.collection.collections.dto.WaterPurifierDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierDtoRunner {
    public static void main(String[] args) {
        WaterPurifierDTO waterPurifierDTO=new WaterPurifierDTO("blue star",5,"white",10000);
        WaterPurifierDTO waterPurifierDTO1=new WaterPurifierDTO("aqua",6,"black",8000);
        WaterPurifierDTO waterPurifierDTO2=new WaterPurifierDTO("liv pure",7,"gray",9000);
        WaterPurifierDTO waterPurifierDTO3=new WaterPurifierDTO("pure it",4,"silver",9600);
        WaterPurifierDTO waterPurifierDTO4=new WaterPurifierDTO("kent",10,"white",5000);
        List<WaterPurifierDTO> list=new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);
        Comparator<WaterPurifierDTO> comparator=new WaterPurifierDtoBrandComparatorAsc();
        System.out.println("After asccc==========================");
        Collections.sort(list,comparator);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<WaterPurifierDTO> comparator1=new WaterPurifierDtoBrandComparatorDesc();
        System.out.println("After desccc===================");
        Collections.sort(list,comparator1);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<WaterPurifierDTO> comparator2=new WaterPurifierDtoCapacityComparatorAsc();
        System.out.println("After asc=============");
        Collections.sort(list,comparator2);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<WaterPurifierDTO> comparator3=new WaterPurifierDtoCapacityComparatorDesc();
        System.out.println("after desc===========");
        Collections.sort(list,comparator3);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<WaterPurifierDTO> comparator4=new WaterPurifierDtoColourComparatorAsc();
        System.out.println("after ascc===========");
        Collections.sort(list,comparator4);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<WaterPurifierDTO> comparator5=new WaterPurifierDtoColourComparatorDesc();
        System.out.println("after desc===============");
        Collections.sort(list,comparator5);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<WaterPurifierDTO>comparator6=new WaterPurifierDtoCostComparatorAsc();
        System.out.println("after ascc===============");
        Collections.sort(list,comparator6);
        for (WaterPurifierDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<WaterPurifierDTO>comparator7=new WaterPurifierDtoCostComparatorDesc();
        System.out.println("After descc======================");
        Collections.sort(list,comparator7);
        for (WaterPurifierDTO ref :list
             ) {
            System.out.println(ref);
        }

    }
}
