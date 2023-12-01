package com.work.shreyas.defaultmethod.thing;

public class Bowl {
    public String type;
    public double cost;
    public String material;

    public Bowl(String type, double cost, String material) {

        this.type = type;
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", material='" + material + '\'' +
                '}';
    }
}
