package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Locker;

public class LockStarter {
    public static void main(String[] args) {
        System.out.println("starting main in LockerStarter");
        Object object =new Object();
        Locker locker = new Locker("europa", 3000d,"MaindoorLock");
        System.out.println(locker);
        System.out.println("Ending main in LockerStarter");
    }
}
