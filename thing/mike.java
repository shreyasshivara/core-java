package com.work.shreyas.defaultmethod.thing;

public class mike {
    public String brand;
    public int range;
    public int warranty;
    public mike(String brand,int range,int warranty){
        this.brand=brand;
        this.range=range;
        this.warranty=warranty;

        System.out.println("created mike uaing String,int,int arg const");
    }

    @Override
    public String toString() {
        return "mike info:brand:"+this.brand + "range:"+this.range+"mtr" + "warranty:"+ this.warranty+"yr";
    }
    public void sound(){
        System.out.println("created sound method"+this.brand);
    }
}
