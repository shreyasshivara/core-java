package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Rice;

public class RiceStarter {
    public static void main(String[] args) {
        System.out.println("starting main in Rice Starter");
        Rice rice =new Rice("sonamusuri","Bullet",1500);
        Rice rice1 =new Rice("rajmudi","Royal Bullet",1400);
        System.out.println(rice);
        System.out.println(rice1);
        System.out.println("Ending main in Rice Starter");
    }
}
