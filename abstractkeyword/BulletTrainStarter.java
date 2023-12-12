package com.xworkz.abstractkeyword;

public class BulletTrainStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in bulletStarter");
        Train train =new BulletTrain();
        train.planning();
        train.approval();
        System.out.println("Ending main in bulletStarter");
    }
}
