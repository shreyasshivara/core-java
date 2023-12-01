package com.work.shreyas.defaultmethod.thing;

public class Bandli {
    public String material;
    public double cost;
    public String type;

    @Override
    public String toString() {
        return "Bandli{" +
                "material='" + material + '\'' +
                ", cost=" + cost +
                ", type='" + type + '\'' +
                '}';
    }

    public Bandli(String material, double cost, String type) {
        this.material = material;
        this.cost = cost;
        this.type = type;
    }
}
