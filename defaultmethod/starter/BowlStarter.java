package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Bowl;

public class BowlStarter {
    public static void main(String[] args) {
        System.out.println("starting main in BowlStarter");
        Bowl bowl=new Bowl("fingerBowl",200,"glass");
        Bowl bowl1=new Bowl("fingerBowl",300,"glass");
        System.out.println(bowl);
        System.out.println(bowl1);
        System.out.println("Ending main in BowlStarter");
    }
}
