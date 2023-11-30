package com.work.shreyas.defaultmethod.starter;

public class LensStarter {
    public static void main(String[] args) {

        System.out.println("starting main in LensStarter");
        Object object=new Object();
        Lens lens=new Lens("fastrack", "round",1000);
        System.out.println(lens);

        System.out.println("Ending main in LensStarter");
    }
}
