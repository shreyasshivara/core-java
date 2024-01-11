package com.xworkz.collection.collections.runner;

import com.xworkz.collection.collections.comparator.*;
import com.xworkz.collection.collections.dto.PaperDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperDtoComparatorRunner {
    public static void main(String[] args) {
        PaperDTO paper=new PaperDTO("ClassMate","A4","white",1);
        PaperDTO paper1=new PaperDTO("basker","A2","pink",10);
        PaperDTO paper2=new PaperDTO("vidya","A1","yellow",15);
        PaperDTO paper3=new PaperDTO("basker","A4","white",2);
        PaperDTO paper4=new PaperDTO("basker","A3","green",20);

        List<PaperDTO> list=new ArrayList<>();
        list.add(paper2);
        list.add(paper);
        list.add(paper1);
        list.add(paper3);
        list.add(paper4);
        Comparator<PaperDTO> comparator=new PaperDtoBrandComparatorAsc();
        System.out.println("paper brand after ascc=============");
        Collections.sort(list,comparator);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);
            
        }
        Comparator<PaperDTO> comparator1=new PaperDtoBrandComparatorDesc();
        System.out.println("paper brand after desc=============");
        Collections.sort(list,comparator1);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<PaperDTO> comparator2=new PaperDtoCostComparatorAsc();
        System.out.println("paper cost after ascc=============");
        Collections.sort(list,comparator2);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<PaperDTO> comparator3=new PaperDtoCostComparatorDesc();
        System.out.println("paper cost after desc=============");
        Collections.sort(list,comparator2);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);

        }
Comparator<PaperDTO> comparator4=new PaperDDtoDimensionComparatorDesc();
        System.out.println("paper dimension after desc=============");
        Collections.sort(list,comparator4);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);
        }
Comparator<PaperDTO> comparator5=new PaperDDtoDimensionComparatorAsc();
        System.out.println("paper dimension after ascc=============");
        Collections.sort(list,comparator5);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<PaperDTO> comparator6=new PaperDtoColourComparatorAsc();
        System.out.println("paper colour after ascc=============");
        Collections.sort(list,comparator6);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<PaperDTO> comparator7=new PaperDtoColourComparatorDesc();
        System.out.println("paper colour after desc=============");
Collections.sort(list,comparator7);
        for (PaperDTO ref:list
             ) {
            System.out.println(ref);

        }
    }
}
