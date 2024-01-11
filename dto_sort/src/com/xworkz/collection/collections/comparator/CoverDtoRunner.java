package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.CoverDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverDtoRunner {
    public static void main(String[] args) {
        CoverDTO coverDTO=new CoverDTO("plastic","black","hand cover",5d);
        CoverDTO coverDTO1=new CoverDTO("paper","white","envolup cover",3d);
        CoverDTO coverDTO2=new CoverDTO("fabric","blue","bike cover",500d);
        CoverDTO coverDTO3=new CoverDTO("paper","green","hand cover",6d);
        CoverDTO coverDTO4=new CoverDTO("nilon","red","car cover",900d);
        List<CoverDTO>list=new ArrayList<>();
        list.add(coverDTO1);
        list.add(coverDTO);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);
        Comparator<CoverDTO> comparator=new CoverDtoColourComparatorAsc();
        System.out.println("after ascc===============");
        Collections.sort(list,comparator);
        for (CoverDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator1=new CoverDtoColourComparatorDesc();
        System.out.println("after descc===============");
        Collections.sort(list,comparator1);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator2=new CoverDtoMaterialComparatorAsc();
        System.out.println("after ascc===============");
        Collections.sort(list,comparator2);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator3=new CoverDtoMaterialComparatorDesc();
        System.out.println("after descc===============");
        Collections.sort(list,comparator3);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator4=new CoverDtoCostComparatorAsc();
        System.out.println("after ascc===============");
        Collections.sort(list,comparator4);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator5=new CoverDtoCostComparatorDesc();
        System.out.println("after descc===============");
        Collections.sort(list,comparator5);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator6=new CoverDtoTypeComparatorAsc();
        System.out.println("after ascc===============");
        Collections.sort(list,comparator6);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<CoverDTO> comparator7=new CoverDtoTypeComparatorDesc();
        System.out.println("after descc===============");
        Collections.sort(list,comparator7);
        for (CoverDTO ref:list
        ) {
            System.out.println(ref);
        }
    }
}
