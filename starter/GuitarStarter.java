package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Guitar;

public class GuitarStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in guitar Starter ");
        Guitar gui=new Guitar();
        Guitar guitar=new Guitar(133, 5900, "Rosewood");
        Guitar guitar1=new Guitar(123, 5900, "Rosewood");
       boolean same=guitar.equals(guitar1);
        System.out.println(same);
        //System.out.println(guitar);
        //System.out.println(guitar1);

        System.out.println("Ending main in guitar Starter ");
    }

}
