package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.ShipDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShipDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        ShipDTO shipDTO=new ShipDTO("titanic","America",1912,415.12f);
        ShipDTO shipDTO1=new ShipDTO("Seawise Giant","england",1920,458.12f);
        ShipDTO shipDTO2=new ShipDTO("Batillus class","japan",1930,414.12f);
        ShipDTO shipDTO3=new ShipDTO("Esso Atlantic/Esso Pacific","india",1945,406.12f);
        ShipDTO shipDTO4=new ShipDTO("Valemax","china",1912,370.12f);
        List<ShipDTO>list=new ArrayList<>();
        list.add(shipDTO1);
        list.add(shipDTO);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);
        Comparator<ShipDTO> comparator=(s1,s2)->
        {
            return s1.getName().compareTo(s2.getName());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc=================");
        for (ShipDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator1=(s1,s2)->
        {
            return s2.getName().compareTo(s1.getName());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator2=(s1,s2)->
        {
            return s1.getCountry().compareTo(s2.getCountry());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator3=(s1,s2)->
        {
            return s2.getCountry().compareTo(s1.getCountry());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator4=(s1,s2)->
        {
            return Integer.compare(s1.getMfy(), s2.getMfy());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator5=(s1,s2)->
        {
            return Integer.compare(s2.getMfy(), s1.getMfy());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator6=(s1,s2)->
        {
            return Float.compare(s1.getLengthInMtr(), s2.getLengthInMtr());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ShipDTO> comparator7=(s1,s2)->
        {
            return Float.compare(s2.getLengthInMtr(), s1.getLengthInMtr());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc=================");
        for (ShipDTO ref:list
        ) {
            System.out.println(ref);
        }

    }
}
