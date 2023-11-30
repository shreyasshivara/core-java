package com.work.shreyas.defaultmethod.thing;

public class Chain {
    public double cost;
    public double weight;
    public String material;

    public Chain(double cost, double weight, String material){
        this.cost=cost;
        this.material=material;
        this.weight=weight;
        System.out.println("created Chain using Double double String Arg const");
    }

    @Override
    public String toString() {
        return "Chain{" +
                "cost=" + cost +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }


}
