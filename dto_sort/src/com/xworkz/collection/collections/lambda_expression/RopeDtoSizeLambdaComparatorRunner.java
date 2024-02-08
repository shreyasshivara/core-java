package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.RopeDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeDtoSizeLambdaComparatorRunner {
    public static void main(String[] args) {
        RopeDto ropeDto=new RopeDto("White",50,"medium","Synthetic Rope");
        RopeDto ropeDto1=new RopeDto("black",100,"big","cotton Rope");
        RopeDto ropeDto2=new RopeDto("green",150,"very big","jute Rope");
        RopeDto ropeDto3=new RopeDto("yellow",90,"small","manila Rope");
        RopeDto ropeDto4=new RopeDto("blue",60,"too small","nylon Rope");
        List<RopeDto>list=new ArrayList<>();
        list.add(ropeDto3);
        list.add(ropeDto);
        list.add(ropeDto1);
        list.add(ropeDto2);
        list.add(ropeDto4);
        Collections.sort(list);
        System.out.println("After ascc-=======================");
        for (RopeDto ref:list
             ) {
            System.out.println(ref);
        }
        Collections.sort(list,(r1,r2)-> r2.getSize().compareTo(r1.getSize()));
        System.out.println("After desc=================");
        for (RopeDto ref:list
             ) {
            System.out.println(ref);
        }
    }
}
