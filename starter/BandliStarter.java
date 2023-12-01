package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Bandli;

public class BandliStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in BandliStarter");

        Bandli bandli=new Bandli("steel",1000,"stick");
        Bandli bandli1=new Bandli("aluminium",500,"non-stick");
        System.out.println(bandli);
        System.out.println(bandli1);
        System.out.println("Ending main in BandliStarter");
    }
}
