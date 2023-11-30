package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Heart;

public class HeartStarter {
    public static void main(String[] args) {
        System.out.println("starting main in HeartStarter");
        Heart heart=new Heart(72,120,250);
        Heart heart1=new Heart(75,130,270);

        System.out.println(heart1);
        System.out.println(heart);

        System.out.println("Ending main in HeartStarter");
    }
}
