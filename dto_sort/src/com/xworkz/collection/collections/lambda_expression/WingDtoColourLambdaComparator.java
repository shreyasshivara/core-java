package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.WingsDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WingDtoColourLambdaComparator {
    public static void main(String[] args) {
        WingsDTO wingsDTO=new WingsDTO(500,"White","crane","big");
        WingsDTO wingsDTO1=new WingsDTO(600,"black","crow","medium");
        WingsDTO wingsDTO2=new WingsDTO(700,"brown","eagle","very big");
        WingsDTO wingsDTO3=new WingsDTO(800,"green","parrot","small");
        WingsDTO wingsDTO4=new WingsDTO(900,"blue","kingfisher","too small");
        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO1);
        list.add(wingsDTO);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);
        Collections.sort(list);
        System.out.println("After asc==================");
        for (WingsDTO ref :list
             ) {
            System.out.println(ref);
        }
        Collections.sort(list,(w1,w2)->w2.getColour().compareTo(w1.getColour()));
        System.out.println("After desc=====================");
        for (WingsDTO ref:list
             ) {
            System.out.println(ref);
        }
    }
}
