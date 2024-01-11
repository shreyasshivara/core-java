package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.VentilatorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VentilatorDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        VentilatorDTO ventilatorDTO=new VentilatorDTO("Drager",30000d,"white","invasive ventilation");
        VentilatorDTO ventilatorDTO1=new VentilatorDTO("phillips",25000d,"black","intensive care");
        VentilatorDTO ventilatorDTO2=new VentilatorDTO("Hamilton",40000d,"blue","invasive ventilation");
        VentilatorDTO ventilatorDTO3=new VentilatorDTO("Medtronic",35000d,"white","invasive ventilation");
        VentilatorDTO ventilatorDTO4=new VentilatorDTO("GE HealthCare",38000d,"white","invasive ventilation");
        List<VentilatorDTO> list=new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);
        Comparator<VentilatorDTO> comparator=(b1,b2)->
        {
            return b1.getBrand().compareTo(b2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc======================");
        for (VentilatorDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator1=(b1,b2)->
        {
            return b2.getBrand().compareTo(b1.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator2=(c1,c2)->
        {
            return Double.compare(c1.getCost(),c2.getCost());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator3=(c1,c2)->
        {
            return Double.compare(c2.getCost(),c1.getCost());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator4=(c1,c2)->
        {
            return c1.getColour().compareTo(c2.getColour());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator5=(c1,c2)->
        {
            return c2.getColour().compareTo(c1.getColour());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator6=(c1,c2)->
        {
            return c1.getColour().compareTo(c2.getColour());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<VentilatorDTO> comparator7=(c1,c2)->
        {
            return c2.getColour().compareTo(c1.getColour());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc======================");
        for (VentilatorDTO ref:list
        ) {
            System.out.println(ref);
        }

    }
}

