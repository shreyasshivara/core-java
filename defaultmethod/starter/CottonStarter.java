package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Cotton;

public class CottonStarter {
    public static void main(String[] args) {
        System.out.println("starting main in Cotton Starter");
        Cotton cotton =new Cotton("good",1000,"1 kg");
        System.out.println(cotton);
        System.out.println("Ending main in Cotton Starter");
    }
}
