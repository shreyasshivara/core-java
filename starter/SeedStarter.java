package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Seed;

public class SeedStarter {
    public static void main(String[] args) {
        System.out.println("starting main in SeedStarter");
        Seed seed=new Seed("rice","Monocotyledonous seeds",500);
        Seed seed1=new Seed("rice","Monocotyledonous seeds",500);
        System.out.println(seed);
        System.out.println(seed1);
        System.out.println("Ending main in SeedStarter");
    }
}
