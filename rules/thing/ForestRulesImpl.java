package com.xworkz.rules.thing;

public class ForestRulesImpl implements ForestRules{
    @Override
    public boolean dontMakeNoice() {
        System.out.println("method dontMakeNoice is implemented");
        return false;
    }

    @Override
    public boolean dontEnterWithoutPErmission() {
        System.out.println("method dontEnterWithoutPErmission is implemented");
        return false;
    }

    @Override
    public boolean takeTicketToGoSafari() {
        System.out.println("method takeTicketToGoSafari is implemented");
        return false;
    }

    @Override
    public boolean dontEnterWIthOwnVehicle() {
        System.out.println("method dontEnterWIthOwnVehicle is implemented");
        return false;
    }
}
