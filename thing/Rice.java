package com.work.shreyas.defaultmethod.thing;

public class Rice {
    public String type;
    public String brand;
    public double cost;

    public Rice(String type, String brand, double cost) {
        this.type = type;
        this.brand = brand;
        this.cost = cost;
        System.out.println("created rice using String String double arg const");
    }

    @Override
    public String toString() {
        return "Rice{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';

    }

}