package com.xworkz.abstractkeyword;

public class RingRoadStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in RingRoadStarter");
        RingRoad ringRoad=new PeripheralRingRoad();
        ringRoad.planning();
        ringRoad.landAcquiring();

        System.out.println("Starting main in RingRoadStarter");
    }
}
