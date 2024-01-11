package com.xworkz.collection.collections.comparator;

import com.xworkz.collection.collections.dto.ParkingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingDtoRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO=new ParkingDTO("wallet parking","Btm",00d,false);
        ParkingDTO parkingDTO1=new ParkingDTO("paid parling","madivala",100d,true);
        ParkingDTO parkingDTO2=new ParkingDTO("basement parling","Btm 2nd stage",00d,false);
        ParkingDTO parkingDTO3=new ParkingDTO("private parling","jaynagar",50d,true);
        ParkingDTO parkingDTO4=new ParkingDTO("open parling","jp nagar",00d,false);
        List<ParkingDTO> list=new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);
        Comparator<ParkingDTO> comparator=new ParkingDtoTypeComparatorAsc();
        System.out.println("After ascc====================");
        Collections.sort(list,comparator);
        for (ParkingDTO ref:list
             ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator1=new ParkingDtoTypeComparatorDesc();
        System.out.println("After descc====================");
        Collections.sort(list,comparator1);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator2=new ParkingDtoCostComparatorAsc();
        System.out.println("After ascc====================");
        Collections.sort(list,comparator2);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator3=new ParkingDtoCostComparatorDesc();
        System.out.println("After descc====================");
        Collections.sort(list,comparator3);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator4=new ParkingDtoIs_Any_ChargesComparatorAsc();
        System.out.println("After ascc====================");
        Collections.sort(list,comparator4);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator5=new ParkingDtoIs_Any_ChargesComparatorDesc();
        System.out.println("After descc====================");
        Collections.sort(list,comparator5);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator6=new ParkingDtoLocationComparatorAsc();
        System.out.println("After ascc====================");
        Collections.sort(list,comparator6);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
        Comparator<ParkingDTO> comparator7=new ParkingDtoLocationComparatorDesc();
        System.out.println("After descc====================");
        Collections.sort(list,comparator7);
        for (ParkingDTO ref:list
        ) {
            System.out.println(ref);

        }
    }
}
