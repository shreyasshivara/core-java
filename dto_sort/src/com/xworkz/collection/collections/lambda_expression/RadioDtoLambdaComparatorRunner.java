package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.RadioDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadioDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        RadioDTO radioDTO=new RadioDTO("phillips",10000,2,"black");
        RadioDTO radioDTO1=new RadioDTO("sony",15000,1,"white");
        RadioDTO radioDTO2=new RadioDTO("LG",8000,3,"gray");
        RadioDTO radioDTO3=new RadioDTO("iBall",7000,1,"red");
        RadioDTO radioDTO4=new RadioDTO("panasonic",9000,3,"orange");
        List<RadioDTO>list=new ArrayList<>();
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO);
        list.add(radioDTO3);
        list.add(radioDTO4);
        Comparator<RadioDTO> comparator=(r1,r2)->
        {
            return r1.getBrand().compareTo(r2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("After ascc=========================");
        for (RadioDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator1=(r1,r2)->
        {
            return r2.getBrand().compareTo(r1.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After descc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator2=(r1,r2)->
        {
            return r1.getColour().compareTo(r2.getColour());
        };
        Collections.sort(list,comparator2);
        System.out.println("After ascc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator3=(r1,r2)->
        {
            return r2.getColour().compareTo(r1.getColour());
        };
        Collections.sort(list,comparator3);
        System.out.println("After descc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator4=(r1,r2)->
        {
            return Integer.compare(r1.getWarrantyInYr(), r2.getWarrantyInYr());
        };
        Collections.sort(list,comparator4);
        System.out.println("After ascc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator5=(r1,r2)->
        {
            return Integer.compare(r2.getWarrantyInYr(), r1.getWarrantyInYr());
        };
        Collections.sort(list,comparator5);
        System.out.println("After descc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator6=(r1,r2)->
        {
            return Double.compare(r1.getCost(), r2.getCost());
        };
        Collections.sort(list,comparator6);
        System.out.println("After ascc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<RadioDTO> comparator7=(r1,r2)->
        {
            return Double.compare(r2.getCost(), r1.getCost());
        };
        Collections.sort(list,comparator7);
        System.out.println("After descc=========================");
        for (RadioDTO ref:list
        ) {
            System.out.println(ref);

        }
    }
}
