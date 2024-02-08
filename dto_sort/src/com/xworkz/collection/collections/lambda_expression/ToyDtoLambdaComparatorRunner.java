package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToyDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        ToyDTO toyDTO=new ToyDTO("train","plastic",500,"black");
        ToyDTO toyDTO1=new ToyDTO("water gun","fiber",200,"yellow");
        ToyDTO toyDTO2=new ToyDTO("remote car","plastic",1000,"blue");
        ToyDTO toyDTO3=new ToyDTO("barbiee","fiber",300,"white");
        ToyDTO toyDTO4=new ToyDTO("gun","hard plastic",100,"black");
        List<ToyDTO> list=new ArrayList<>();
        list.add(toyDTO1);
        list.add(toyDTO);
        list.add(toyDTO2);
        list.add(toyDTO3);
        list.add(toyDTO4);
        Collections.sort(list);
        System.out.println("after asccc=============================");


        Collections.sort(list,(t1, t2) ->t2.getName().compareTo(t1.getName()));//////qn/d
        System.out.println("After desc=====================");
        for (ToyDTO ref:list
             ) {
            System.out.println(ref );
        }

    }
}
