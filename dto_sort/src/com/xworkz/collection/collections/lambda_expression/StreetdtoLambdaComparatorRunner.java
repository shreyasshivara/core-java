package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.StreetDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetdtoLambdaComparatorRunner {
    public static void main(String[] args) {
        StreetDTO streetDTO=new StreetDTO(3,500,"mysore","tugudeepa");
        StreetDTO streetDTO1=new StreetDTO(4,1000,"mysore","devraj urs");
        StreetDTO streetDTO2=new StreetDTO(10,1500,"banglore","ChurchStreet");
        StreetDTO streetDTO3=new StreetDTO(8,2500,"koramangala","vemana");
        StreetDTO streetDTO4=new StreetDTO(5,3500,"btm","punithrajkumar");
        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);
        Comparator<StreetDTO> comparator=(s1,s2)->
        {
            return Integer.compare(s1.getLengthInMtr(), s2.getLengthInMtr());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc============================");
        for (StreetDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator1=(s1,s2)->
        {
            return Integer.compare(s2.getLengthInMtr(), s1.getLengthInMtr());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator2=(s1,s2)->
        {
            return Integer.compare(s1.getWidthInMtr(), s2.getWidthInMtr());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator3=(s1,s2)->
        {
            return Integer.compare(s2.getWidthInMtr(), s1.getWidthInMtr());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator4=(s1,s2)->
        {
            return s1.getName().compareTo(s2.getName());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator5=(s1,s2)->
        {
            return s2.getName().compareTo(s1.getName());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator6=(s1,s2)->
        {
            return s1.getLocation().compareTo(s2.getLocation());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<StreetDTO> comparator7=(s1,s2)->
        {
            return s2.getLocation().compareTo(s1.getLocation());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc============================");
        for (StreetDTO ref:list
        ) {
            System.out.println(ref);

        }


    }
}
