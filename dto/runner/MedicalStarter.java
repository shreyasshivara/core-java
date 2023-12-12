package com.xworkz.dto.runner;

import com.xworkz.dto.thing.MedicalDTO;

public class MedicalStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in MedicalStarter");
        MedicalDTO medicalDTO=new MedicalDTO("medPlus","Btm","24*7","Shreyas",9876543210l,"Shreyas",true,5,4.9,4);
        MedicalDTO medicalDTO1=new MedicalDTO("apollo","Btm","24*7","Shreyas",9876543210l,"Shreyas",true,5,4.9,5);
boolean same=medicalDTO.equals(medicalDTO1);
        System.out.println(same);
        System.out.println(medicalDTO1);
        System.out.println(medicalDTO);

        System.out.println("Ending main in MedicalStarter");
    }
}
