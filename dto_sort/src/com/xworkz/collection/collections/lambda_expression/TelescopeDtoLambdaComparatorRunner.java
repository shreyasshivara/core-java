package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.TeleScopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TelescopeDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        TeleScopeDTO teleScopeDTO=new TeleScopeDTO("Celestron","black",2000d,10);
        TeleScopeDTO teleScopeDTO1=new TeleScopeDTO("Orion","white",5000d,11);
        TeleScopeDTO teleScopeDTO2=new TeleScopeDTO("Explore Scientific","blue",8000d,9);
        TeleScopeDTO teleScopeDTO3=new TeleScopeDTO("Sky-Watcher","green",6000d,8);
        TeleScopeDTO teleScopeDTO4=new TeleScopeDTO(" Vixen","gray",4000d,12);
        List<TeleScopeDTO>list=new ArrayList<>();
        list.add(teleScopeDTO);
        list.add(teleScopeDTO1);
        list.add(teleScopeDTO2);
        list.add(teleScopeDTO3);
        list.add(teleScopeDTO4);
        Comparator<TeleScopeDTO> comparator=(t1,t2)->
        {
            return t1.getBrand().compareTo(t2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("after asc==========");
        for (TeleScopeDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator1=(t1,t2)->
        {
            return t2.getBrand().compareTo(t1.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc===========");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator2=(t1,t2)->
        {
            return t1.getColour().compareTo(t2.getColour());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc===========");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator3=(t1,t2)->
        {
            return t2.getColour().compareTo(t1.getColour());
        };
        Collections.sort(list,comparator3);
        System.out.println("after desc================");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator4=(t1,t2)->
        {
            return Integer.compare(t1.getWarrantyInYrs(),t2.getWarrantyInYrs());
        };
        Collections.sort(list,comparator4);
        System.out.println("after asc================");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator5=(t1,t2)->
        {
            return Integer.compare(t2.getWarrantyInYrs(),t1.getWarrantyInYrs());
        };
        Collections.sort(list,comparator5);
        System.out.println("after desc================");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator6=(t1,t2)->
        {
            return Double.compare(t1.getCost(),t2.getCost());
        };
        Collections.sort(list,comparator6);
        System.out.println("after asc================");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<TeleScopeDTO> comparator7=(t1,t2)->
        {
            return Double.compare(t2.getCost(),t1.getCost());
        };
        Collections.sort(list,comparator7);
        System.out.println("after desc================");
        for (TeleScopeDTO ref:list
        ) {
            System.out.println(ref);
        }


    }
}
