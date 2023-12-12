package com.xworkz.dto.runner;

import com.xworkz.dto.thing.HospitalDTO;

public class HospitalStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in HospitalStarter");
        HospitalDTO hospital=new HospitalDTO("apollo", "BTM","Chordiology",200,9876543210l,false,100,20,40);
        HospitalDTO hospital1=new HospitalDTO("jaydeva", "mysore","Chordiology",160,9876543210l,false,100,20,40);
        boolean same = hospital.equals(hospital1);
        System.out.println(same);
        System.out.println(hospital1);
        System.out.println(hospital);
        System.out.println("Ending main in HospitalStarter");
    }
}
