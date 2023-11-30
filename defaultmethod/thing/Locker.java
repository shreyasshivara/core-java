package com.work.shreyas.defaultmethod.thing;

public class Locker {

    public String brand;
    public double cost;
    public String type;

    public Locker(String brand,double cost,String type){
        this.brand=brand;
        this.cost=cost;
        this.type=type;
        System.out.println("created String,brand,double arg const ");
    }

    @Override
    public String toString() {

        return "lockerinfo: brand:"+this.brand+" cost:"+this.cost+" type:"+this.type;
    }
}
