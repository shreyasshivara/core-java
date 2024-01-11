package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.SensorDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorDtoRunner {
    public static void main(String[] args) {
        SensorDTO sensorDTO=new SensorDTO("Honeywell",1000d,5,"piezo");
        SensorDTO sensorDTO1=new SensorDTO("Texas Instruments",1500d,10,"position");
        SensorDTO sensorDTO2=new SensorDTO("NPX",2000d,2,"force");
        SensorDTO sensorDTO3=new SensorDTO("TE Connectivity",600d,100,"thermo");
        SensorDTO sensorDTO4=new SensorDTO("Bosch",12000d,1000,"vibration");
        List<SensorDTO> list=new ArrayList<>();
        list.add(sensorDTO);
        list.add(sensorDTO1);
        list.add(sensorDTO2);
        list.add(sensorDTO3);
        list.add(sensorDTO4);
        Comparator<SensorDTO>comparator=new SensorDtoBrandComparatorAsc();
        System.out.println("After asc============================");
        Collections.sort(list,comparator);
        for (SensorDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator1=new SensorDtoBrandComparatorDesc();
        System.out.println("After desc============================");
        Collections.sort(list,comparator1);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator2=new SensorDtoCostComparatorAsc();
        System.out.println("After asc============================");
        Collections.sort(list,comparator2);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator3=new SensorDtoCostComparatorDesc();
        System.out.println("After Desc============================");
        Collections.sort(list,comparator3);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator4=new SensorDtoDistanceComparatorAsc();
        System.out.println("After asc============================");
        Collections.sort(list,comparator4);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator5=new SensorDtoDistanceComparatorDesc();
        System.out.println("After Desc============================");
        Collections.sort(list,comparator5);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator6=new SensorDtoTypeComparatorAsc();
        System.out.println("After asc============================");
        Collections.sort(list,comparator6);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SensorDTO>comparator7=new SensorDtoTypeComparatorDesc();
        System.out.println("After desc============================");
        Collections.sort(list,comparator7);
        for (SensorDTO ref:list
        ) {
            System.out.println(ref);

        }


    }
}
