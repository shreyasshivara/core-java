package com.xworkz.abstractkeyword;

public class AeracudPlantStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in AeracudPlantStarter");
        Plant plant=new AeracudPlant();
        plant.plantation();
        plant.income();



        System.out.println("Ending main in AeracudPlantStarter");
    }
}
