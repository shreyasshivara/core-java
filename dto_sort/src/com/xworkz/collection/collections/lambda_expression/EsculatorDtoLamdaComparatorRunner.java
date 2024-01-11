package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.EsculatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EsculatorDtoLamdaComparatorRunner {
    public static void main(String[] args) {
        EsculatorDTO esculatorDTO=new EsculatorDTO(150,"Moving walkways",100000d,"Schindler");
        EsculatorDTO esculatorDTO1=new EsculatorDTO(200,"Parallel Escalator.",150000d,"Otis Elevator");
        EsculatorDTO esculatorDTO2=new EsculatorDTO(400,"Stairway escalators",200000d,"KONE Corporation");
        EsculatorDTO esculatorDTO3=new EsculatorDTO(300,"Belt-type escalators",100900d,"ThyssenKrupp AG");
        EsculatorDTO esculatorDTO4=new EsculatorDTO(450,"Curved escalators",100600d,"Hitachi Ltd");
        List<EsculatorDTO> list=new ArrayList<>();
        list.add(esculatorDTO1);
        list.add(esculatorDTO);
        list.add(esculatorDTO2);
        list.add(esculatorDTO3);
        list.add(esculatorDTO4);
        Comparator<EsculatorDTO> comparator=(e1,e2)->
        {
            return Integer.compare(e1.getTotalSteps(),e2.getTotalSteps());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc======================");
        for (EsculatorDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator1=(e1,e2)->
        {
            return Integer.compare(e2.getTotalSteps(),e1.getTotalSteps());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator2=(e1,e2)->
        {
            return Double.compare(e1.getCost(),e2.getCost());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator3=(e1,e2)->
        {
            return Double.compare(e2.getCost(),e1.getCost());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator4=(e1,e2)->
        {
            return e1.getType().compareTo(e2.getType());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator5=(e1,e2)->
        {
            return e2.getType().compareTo(e1.getType());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator6=(e1,e2)->
        {
            return e1.getBrand().compareTo(e2.getBrand());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<EsculatorDTO> comparator7=(e1,e2)->
        {
            return e2.getBrand().compareTo(e1.getBrand());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc======================");
        for (EsculatorDTO ref:list
        ) {
            System.out.println(ref);
        }


    }
}
