package com.work.shreyas.defaultmethod.thing;

public class Money {
    public String type;



    public int value;
    public String country;
    public Money(String type, int value, String country) {
        this.type = type;
        this.value = value;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Money{" +
                "type='" + type + '\'' +
                ", value=" + value +
                ", country='" + country + '\'' +
                '}';
    }
}
