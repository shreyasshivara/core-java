package com.xworkz.collection.collections.lambda_expression;

import com.xworkz.collection.collections.dto.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkyWalkDtoLambdaComparatorRunner {
    public static void main(String[] args) {
        SkyWalkDTO skyWalkDTO=new SkyWalkDTO(50,2023,15,"Dr.raj");
        SkyWalkDTO skyWalkDTO1=new SkyWalkDTO(40,2022,10,"Dr.vishnuvardhan");
        SkyWalkDTO skyWalkDTO2=new SkyWalkDTO(55,2020,12,"Dr.ambarish");
        SkyWalkDTO skyWalkDTO3=new SkyWalkDTO(30,2010,13,"Shankarnag");
        SkyWalkDTO skyWalkDTO4=new SkyWalkDTO(80,2023,18,"Dr.shivarajkumar");
        List<SkyWalkDTO> list=new ArrayList<>();
        list.add(skyWalkDTO);
        list.add(skyWalkDTO1);
        list.add(skyWalkDTO2);
        list.add(skyWalkDTO3);
        list.add(skyWalkDTO4);

        Comparator<SkyWalkDTO> comparator=(d1,d2)->
        {
            return Integer.compare(d1.getDistenceInMtr(),d2.getDistenceInMtr());
        };
        System.out.println("after ass================");
        Collections.sort(list,comparator);
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);
        }

        Comparator<SkyWalkDTO> comparator1=(d1,d2)->
        {
            return Integer.compare(d2.getDistenceInMtr(),d1.getDistenceInMtr());
        };
        System.out.println("after desc======================");
        Collections.sort(list,comparator1);
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator2=(c1,c2)->{
            return Integer.compare(c1.getConstYr(),c2.getConstYr());
        };
        System.out.println("after asc======================");
        Collections.sort(list,comparator2);
        for (SkyWalkDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator3=(c1,c2)->{
            return Integer.compare(c2.getConstYr(),c1.getConstYr());
        };
        System.out.println("after desc======================");
        Collections.sort(list,comparator3);
        for (SkyWalkDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator4=(h1,h2)->{
            return Integer.compare(h1.getHight(), h2.getHight());
        };
        Collections.sort(list,comparator4);
        System.out.println("after asc==================");
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator5=(h1,h2)->{
            return Integer.compare(h2.getHight(),h1.getHight());

        };
        Collections.sort(list,comparator5);
        System.out.println("after Desc==================");
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator6=(n1,n2)->{
            return n1.getName().compareTo(n2.getName());
        };
        Collections.sort(list,comparator6);
        System.out.println("After asc=======================");
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<SkyWalkDTO> comparator7=(n1,n2)->
        {
            return n2.getName().compareTo(n1.getName());
        };
        Collections.sort(list,comparator7);
        System.out.println("After desc===================");
        for (SkyWalkDTO ref:list
             ) {
            System.out.println(ref);

        }
    }

}
