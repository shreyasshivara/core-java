package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Bucket;

public class BucketStarter {
    public static void main(String[] args) {
        System.out.println("starting main in BucketStarter");

        Bucket bucket=new Bucket("jackpot",200, "plastic");
        Bucket bucket1=new Bucket("tupperware",600, "plastic");
        System.out.println(bucket);
        System.out.println(bucket1);
        System.out.println("Ending main in BucketStarter");
    }

}
