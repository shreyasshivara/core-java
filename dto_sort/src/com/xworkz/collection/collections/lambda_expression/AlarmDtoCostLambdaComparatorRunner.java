package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.AlarmDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlarmDtoCostLambdaComparatorRunner {
    public static void main(String[] args) {
        AlarmDTO alarmDTO=new AlarmDTO("ajanta",1000d,"Black","india");
        AlarmDTO alarmDTO1=new AlarmDTO("philips",1500d,"white","china");
        AlarmDTO alarmDTO2=new AlarmDTO("titan",1200d,"blue","japan");
        AlarmDTO alarmDTO3=new AlarmDTO("hmt",900d,"yellow","india");
        AlarmDTO alarmDTO4=new AlarmDTO("tissot",10000d,"gold","Switzerland");
        List<AlarmDTO>list=new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);
        Collections.sort(list);
        System.out.println("After asc======================");
        for (AlarmDTO ref:list
             ) {
            System.out.println(ref);

        }
        Collections.sort(list,(a1,a2)->a2.getCost().compareTo(a1.getCost()));
        System.out.println("After desc=================");
        for (AlarmDTO ref :list
             ) {
            System.out.println(ref);
        }

        }
    }

