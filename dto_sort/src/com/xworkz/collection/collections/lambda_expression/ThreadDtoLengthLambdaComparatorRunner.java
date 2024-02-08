package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.ThreadDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadDtoLengthLambdaComparatorRunner {
    public static void main(String[] args) {
        ThreadDTO threadDTO=new ThreadDTO(100,"white",5,"Metric thread");
        ThreadDTO threadDTO1=new ThreadDTO(150,"black",3,"Buttress thread");
        ThreadDTO threadDTO2=new ThreadDTO(120,"brown",4,"Square threads");
        ThreadDTO threadDTO3=new ThreadDTO(160,"green",6,"Worm threads");
        ThreadDTO threadDTO4=new ThreadDTO(110,"blue",7,"Knuckle threads");
        List<ThreadDTO>list=new ArrayList<>();
        list.add(threadDTO1);
        list.add(threadDTO);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);
        Collections.sort(list);
        System.out.println("After ascc===================");
        for (ThreadDTO ref:list
             ) {
            System.out.println(ref);
        }
        Collections.sort(list,(t1,t2)->Integer.compare(t2.getLengthInCm(),t1.getLengthInCm())
        );
        System.out.println("After desc==========================");
        for (ThreadDTO ref:list
             ) {
            System.out.println(ref);
        }
    }
}
