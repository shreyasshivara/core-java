package com.xworkz.rules.runner;

import com.xworkz.rules.thing.ForestRules;
import com.xworkz.rules.thing.ForestRulesImpl;

public class ForestRulesStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in ForestRulesStarter");
        ForestRulesImpl forestRules=new ForestRulesImpl();
        forestRules.dontEnterWithoutPErmission();
        forestRules.dontMakeNoice();
        forestRules.takeTicketToGoSafari();
        forestRules.dontEnterWIthOwnVehicle();
        System.out.println("Forest name is :"+ForestRulesImpl.FOREST_NAME);
        System.out.println("Forest type is:"+ ForestRules.FOREST_TYPE);
        System.out.println("Ending main in ForestRulesStarter");
    }
}
