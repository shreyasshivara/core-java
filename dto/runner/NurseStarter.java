package com.xworkz.dto.runner;

import com.xworkz.dto.thing.Nurse;

public class NurseStarter {
    public static void main(String[] args) {
        System.out.println("starting main in NurseStarter");

        Nurse nurse=new Nurse("vennila",22,9876543210l,5,"st.joseph",25000,false,"headNurse");
        Nurse nurse1=new Nurse("vennila",22,9876543210l,5,"st.joseph",25000,false,"headNurse");
        boolean same=nurse.equals(nurse1);
        System.out.println(same);
        System.out.println(nurse);
        System.out.println(nurse1);


        System.out.println("Ending main in NurseStarter");
    }
}
