package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.CharcoalDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalDtoRunner {
    public static void main(String[] args) {
        CharcoalDTO charcoalDTO=new CharcoalDTO("Black",1,100,"Lump");
        CharcoalDTO charcoalDTO1=new CharcoalDTO("white",2,500,"Charcoal briquettes");
        CharcoalDTO charcoalDTO2=new CharcoalDTO("grey",3,200,"hardwood briquettes");
        CharcoalDTO charcoalDTO3=new CharcoalDTO("Black",4,300,"binchotan");
        CharcoalDTO charcoalDTO4=new CharcoalDTO("Black",5,50," coconut shell charcoal");
        List<CharcoalDTO> list=new ArrayList<>();
        list.add(charcoalDTO);
        list.add(charcoalDTO1);
        list.add(charcoalDTO2);
        list.add(charcoalDTO3);
        list.add(charcoalDTO4);
        Comparator<CharcoalDTO> comparator=new CharcoalDtoColourComparatorAsc();
        System.out.println("After asc====================");
        Collections.sort(list,comparator);
        for (CharcoalDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator1=new CharcoalDtoColourComparatorDesc();
        System.out.println("After desc====================");
        Collections.sort(list,comparator1);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator2=new CharcoalDtoQuantityComparatorAsc();
        System.out.println("After asc====================");
        Collections.sort(list,comparator2);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator3=new CharcoalDtoQuantityComparatorDesc();
        System.out.println("After desc====================");
        Collections.sort(list,comparator3);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator4=new CharcoalDtoCostComparatorDesc();
        System.out.println("After desc====================");
        Collections.sort(list,comparator4);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator5=new CharcoalDtoCostComparatorAsc();
        System.out.println("After asc====================");
        Collections.sort(list,comparator5);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator6=new CharcoalDtoQuantityComparatorAsc();
        System.out.println("After asc====================");
        Collections.sort(list,comparator6);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CharcoalDTO> comparator7=new CharcoalDtoQuantityComparatorDesc();
        System.out.println("After desc====================");
        Collections.sort(list,comparator7);
        for (CharcoalDTO ref:list
        ) {
            System.out.println(ref);
        }
    }
}