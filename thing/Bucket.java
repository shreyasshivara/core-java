package com.work.shreyas.defaultmethod.thing;

public class Bucket {
    public String brand;
    public double cost;
    public String material;

    public Bucket(String brand, double cost, String material) {
        this.brand = brand;
        this.cost = cost;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", material='" + material + '\'' +
                '}';
    }
}
