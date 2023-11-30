package com.work.shreyas.defaultmethod.thing;

public class Seed {
    public String name;
    public String type;
    public  double cost;

    public Seed(String name, String type, double cost)
    {
        this.name=name;
        this.type=type;
        this.cost=cost;
        System.out.println("created seed using String ,String, double arg const");
    }

    @Override
    public String toString() {
        return "Seed info: name:"+this.name +" type:"+ this.type +" cost:"+this.cost+"rs";
    }
}
