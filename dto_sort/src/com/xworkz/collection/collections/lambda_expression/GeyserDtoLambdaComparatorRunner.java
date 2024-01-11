package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.GeyserDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GeyserDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        GeyserDTO geyserDTO=new GeyserDTO("v-guard",10,"White",2);
        GeyserDTO geyserDTO1=new GeyserDTO("LG",20,"black",1);
        GeyserDTO geyserDTO2=new GeyserDTO("Samsung",5,"silver",3);
        GeyserDTO geyserDTO3=new GeyserDTO("Sony",9,"red",4);
        GeyserDTO geyserDTO4=new GeyserDTO("philips",8,"White",5);
        List<GeyserDTO>list=new ArrayList<>();
        list.add(geyserDTO1);
        list.add(geyserDTO);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);
        Comparator<GeyserDTO> comparator=(g1,g2)->
        {
            return g1.getBrand().compareTo(g2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("After ascc=============================");
        for (GeyserDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator1=(g1,g2)->
        {
            return g2.getBrand().compareTo(g2.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc");
        for (GeyserDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<GeyserDTO> comparator2=(g1,g2)->
        {
            return g1.getColour().compareTo(g2.getColour());
        };
        Collections.sort(list,comparator2);
        System.out.println("After ascc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator3=(g1,g2)->
        {
            return g2.getColour().compareTo(g1.getColour());
        };
        Collections.sort(list,comparator3);
        System.out.println("After descc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator4=(g1,g2)->
        {
            return Integer.compare(g1.getCapacityInLtrs(), g2.getCapacityInLtrs());
        };
        Collections.sort(list,comparator4);
        System.out.println("After ascc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator5=(g1,g2)->
        {
            return Integer.compare(g2.getCapacityInLtrs(), g1.getCapacityInLtrs());
        };
        Collections.sort(list,comparator5);
        System.out.println("After descc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator6=(g1,g2)->
        {
            return Integer.compare(g1.getWarrantyInYr(), g2.getWarrantyInYr());
        };
        Collections.sort(list,comparator6);
        System.out.println("After ascc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<GeyserDTO> comparator7=(g1,g2)->
        {
            return Integer.compare(g2.getWarrantyInYr(), g1.getWarrantyInYr());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desscc=============================");
        for (GeyserDTO ref:list
        ) {
            System.out.println(ref);

        }

    }
}
