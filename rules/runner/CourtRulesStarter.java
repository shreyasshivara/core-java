package com.xworkz.rules.runner;

import com.xworkz.rules.thing.CourtRulesImpl;


public class CourtRulesStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in CourtRules Starter");
        CourtRulesImpl courtRules=new CourtRulesImpl();

        courtRules.respectCourt();
        courtRules.dontMakeNoise();
        courtRules.noSmooking();
        courtRules.ObeyORder();
        System.out.println("Court name is :"+ CourtRulesImpl.CourtNAME);
        System.out.println("Court location is :"+CourtRulesImpl.COURTLOCATION);

        System.out.println("Ending main in CourtRules Starter");
    }
}
