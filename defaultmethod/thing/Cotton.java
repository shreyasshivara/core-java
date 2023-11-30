package com.work.shreyas.defaultmethod.thing;

public class Cotton {
    public String quality;
    public double cost;
    public String  quantity;

    public Cotton(String quality,double cost,String quantity){
        this.cost=cost;
        this.quality=quality;
        this.quantity=quantity;
        System.out.println("Created Cotton using String,double,int arg const");

    }

    @Override
    public String toString() {
        return "Cotton info:cost:"+this.cost+ " quality:"+this.quality+ "quantity:"+this.quantity;
    }
}
