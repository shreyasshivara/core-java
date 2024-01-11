package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.LiftDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiftDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        LiftDTO liftDTO=new LiftDTO("otis",600,500000d,5);
        LiftDTO liftDTO1=new LiftDTO("Schindler",1000,900000d,8);
        LiftDTO liftDTO2=new LiftDTO("KONE",1020,990000d,6);
        LiftDTO liftDTO3=new LiftDTO("Thyssenkrupp",800,600000d,7);
        LiftDTO liftDTO4=new LiftDTO("Fujitec",550,450000d,8);
        List<LiftDTO>list=new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);
        list.add(liftDTO4);
        Comparator<LiftDTO> comparator=(l1,l2)->
        {
            return l1.getBrand().compareTo(l2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc========");
        for (LiftDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator1=(l1,l2)->
        {
            return l2.getBrand().compareTo(l1.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator2=(l1,l2)->
        {
            return Integer.compare(l1.getCapacityInKg(),l2.getCapacityInKg());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator3=(l1,l2)->
        {
            return Integer.compare(l2.getCapacityInKg(),l1.getCapacityInKg());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator4=(l1,l2)->
        {
            return Integer.compare(l1.getNoOfFloars(),l2.getNoOfFloars());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator5=(l1,l2)->
        {
            return Integer.compare(l2.getNoOfFloars(),l1.getNoOfFloars());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator6=(l1,l2)->
        {
            return Double.compare(l2.getCost(),l1.getCost());
        };
        Collections.sort(list,comparator6);
        System.out.println("After desc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<LiftDTO> comparator7=(l1,l2)->
        {
            return Double.compare(l1.getCost(),l2.getCost());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc========");
        for (LiftDTO ref:list
        ) {
            System.out.println(ref);
        }


    }
}
