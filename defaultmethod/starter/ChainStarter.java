package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Chain;

public class ChainStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in ChainStarter");
        Chain chain=new Chain(50000,10,"gold");
        Chain chain1=new Chain(60000,15,"silver");
        System.out.println(chain);
        System.out.println(chain1);
        System.out.println("Ending main in ChainStarter");
    }
}
