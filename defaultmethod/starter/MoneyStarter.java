package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.Money;

public class MoneyStarter {
    public static void main(String[] args) {
        System.out.println("starting main in moneyStarter");

        Money money=new Money("rupees",100,"india");
        Money money1=new Money("Doller",100,"USA");

        System.out.println(money);
        System.out.println(money1);
        System.out.println("Ending main in moneyStarter");
    }
}
