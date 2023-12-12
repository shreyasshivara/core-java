package com.xworkz.dto.runner;


import com.xworkz.dto.thing.PatientDTO;

public class PatientStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in PatientStarter");
        PatientDTO patientDTO  = new PatientDTO("Shreyas","highBP",24, "A-ve",9876543210l,false,false,85,182);
        PatientDTO patientDTO1=new PatientDTO("Shreyas","highBP",24, "A-ve",9878743210l,true,true,85,182);
        boolean same = patientDTO.equals(patientDTO1);
        System.out.println(same);
        System.out.println("Ending main in PatientStarter");


    }
}
