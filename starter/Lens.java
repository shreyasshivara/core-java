package com.work.shreyas.defaultmethod.starter;

import com.sun.corba.se.impl.oa.toa.TOA;

public class Lens {


        public String brand;

        public String type;

        public double cost;

        Lens(String brand,String type,double cost){
            this.brand=brand;
            this.cost=cost;
            this.type=type;
            System.out.println("created Lens using String,String,double arg const");
        }

    @Override
    public String toString() {
        return "Lens info: brand:"+this.brand +"cost:"+this.cost+"type:"+this.type;
    }

}
