package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.BeltDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltDtoRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO=new BeltDTO("van Husein",800d,"leather","black");
        BeltDTO beltDTO1=new BeltDTO("tommyHilfiger",900d,"genune leather","brown");
        BeltDTO beltDTO2=new BeltDTO("Woodlands",1000d,"rubber","gray");
        BeltDTO beltDTO3=new BeltDTO("bata",700d,"fabric","white");
        BeltDTO beltDTO4=new BeltDTO("levis",999d,"leather","black");
        List<BeltDTO>list=new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);
        Comparator<BeltDTO> comparator=new BeltDtoBrandComparatorAsc();
        System.out.println("After asc===============");
        Collections.sort(list,comparator);
        for (BeltDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator1=new BeltDtoBrandComparatorDesc();
        System.out.println("After desc===============");
        Collections.sort(list,comparator1);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator2=new BeltDtoMaterialComparatorAsc();
        System.out.println("After asc===============");
        Collections.sort(list,comparator2);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator3=new BeltDtoMaterialComparatorDesc();
        System.out.println("After desc===============");
        Collections.sort(list,comparator3);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator4=new BeltDtoCostComparatorAsc();
        System.out.println("After asc===============");
        Collections.sort(list,comparator4);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator5=new BeltDtoCostComparatorDesc();
        System.out.println("After desc===============");
        Collections.sort(list,comparator5);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator6=new BeltDtoColourComparatorAsc();
        System.out.println("After asc===============");
        Collections.sort(list,comparator6);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<BeltDTO> comparator7=new BeltDtoColourComparatorDesc();
        System.out.println("After desc===============");
        Collections.sort(list,comparator7);
        for (BeltDTO ref:list
        ) {
            System.out.println(ref);

        }

    }
}
