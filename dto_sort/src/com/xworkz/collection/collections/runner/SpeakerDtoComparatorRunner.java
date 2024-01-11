package com.xworkz.collection.collections.runner;

import com.xworkz.collection.collections.comparator.*;
import com.xworkz.collection.collections.dto.SpeakerDTO;

import java.util.*;

public class SpeakerDtoComparatorRunner {
    public static void main(String[] args) {

        SpeakerDTO speakerDTO=new SpeakerDTO("JBL",10000d,"black","1yr");
        SpeakerDTO speakerDTO1=new SpeakerDTO("harman",1000d,"black","1yr");
        SpeakerDTO speakerDTO2=new SpeakerDTO("boat",5000d,"black","1yr");
        SpeakerDTO speakerDTO3=new SpeakerDTO("ahujha",8000d,"black","1yr");
        SpeakerDTO speakerDTO4=new SpeakerDTO("pioneer",9000d,"black","1yr");
        List<SpeakerDTO>list=new ArrayList<>();
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);
        list.add(speakerDTO4);
        Comparator<SpeakerDTO> comparator=new SpeakerDtoBrandComparatorAsc();
        System.out.println("sort after asc============================");
        Collections.sort(list,comparator);
        /*Iterator<SpeakerDTO> iterator= list.iterator();*/
       /* while (iterator.hasNext()){
            SpeakerDTO ref=iterator.next();
                System.out.println(ref);

        }*/
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SpeakerDTO> comparator1=new SpeakerDtoBrandComparatorDesc();
        System.out.println("After desc=======================");
        Collections.sort(list,comparator1);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<SpeakerDTO> comparator2=new SpeakerDtoColourComparatorAsc();
        System.out.println("after ascc===================================");
        Collections.sort(list,comparator2);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<SpeakerDTO> comparator3=new SpeakerDtoColourComparatorDesc();
        System.out.println("sfter desc====================");
        Collections.sort(list,comparator3);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SpeakerDTO> comparator4=new SpeakerDtoCostComparatorAsc();
        System.out.println("After ascc===============================");
        Collections.sort(list,comparator4);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<SpeakerDTO> comparator5=new SpeakerDtoCostComparatorDesc();
        System.out.println("after desc==============");
        Collections.sort(list,comparator5);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<SpeakerDTO> comparator6=new SpeakerDtoWarrantyComparatorAsc();
        System.out.println("After ascc=============================");
        Collections.sort(list,comparator6);
        for (SpeakerDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SpeakerDTO> comparator7=new SpeakerDtoWarrantyComparatorDesc();
        System.out.println("after desc===============================");
        Collections.sort(list,comparator7);
    }

 }
