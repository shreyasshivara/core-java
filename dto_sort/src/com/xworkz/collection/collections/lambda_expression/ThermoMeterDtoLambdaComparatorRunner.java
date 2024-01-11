package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.ThermoMeterDTO;
import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThermoMeterDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        ThermoMeterDTO thermoMeterDTO=new ThermoMeterDTO("omron","digital",1000d,"white");
        ThermoMeterDTO thermoMeterDTO1=new ThermoMeterDTO("apollo","ear",900d,"yellow");
        ThermoMeterDTO thermoMeterDTO2=new ThermoMeterDTO("Dr.morepen","strip",990d,"black");
        ThermoMeterDTO thermoMeterDTO3=new ThermoMeterDTO("BPL","infrared",999d,"gray");
        ThermoMeterDTO thermoMeterDTO4=new ThermoMeterDTO("tritemp","digital",1500d,"white");
        List<ThermoMeterDTO>list=new ArrayList<>();
        list.add(thermoMeterDTO);
        list.add(thermoMeterDTO1);
        list.add(thermoMeterDTO2);
        list.add(thermoMeterDTO3);
        list.add(thermoMeterDTO4);
        Comparator<ThermoMeterDTO> comparator=(t1,t2)->
        {
            return t1.getBrand().compareTo(t2.getBrand());
        };
        Collections.sort(list,comparator);
        System.out.println("After asc==============");
        for (ThermoMeterDTO ref:list
             ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator1=(t1,t2)->
        {
            return t2.getBrand().compareTo(t1.getBrand());
        };
        Collections.sort(list,comparator1);
        System.out.println("After desc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator2=(t1,t2)->
        {
            return t1.getColour().compareTo(t2.getColour());
        };
        Collections.sort(list,comparator2);
        System.out.println("After asc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator3=(t1,t2)->
        {
            return t2.getColour().compareTo(t1.getColour());
        };
        Collections.sort(list,comparator3);
        System.out.println("After desc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator4=(t1,t2)->
        {
            return Double.compare(t1.getCost(), t2.getCost());
        };
        Collections.sort(list,comparator4);
        System.out.println("After asc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator5=(t1,t2)->
        {
            return Double.compare(t2.getCost(), t1.getCost());
        };
        Collections.sort(list,comparator5);
        System.out.println("After desc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator6=(t1,t2)->
        {
            return t1.getType().compareTo( t2.getType());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }
        Comparator<ThermoMeterDTO> comparator7=(t1,t2)->
        {
            return t2.getType().compareTo( t1.getType());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc==============");
        for (ThermoMeterDTO ref:list
        ) {
            System.out.println(ref);
        }


    }
}
