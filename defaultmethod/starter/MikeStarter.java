package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.mike;

public class MikeStarter {
    public static void main(String[] args) {
        mike m=new mike("Universal Audio",1,1);
        mike m1=new mike("Universal Audio",2,3);
        System.out.println(m);
        System.out.println(m1);

        m.sound();
        m1.sound();

    }
}
