package com.xworkz.rules.runner;

import com.xworkz.rules.thing.HospitalRules;
import com.xworkz.rules.thing.HospitalRulesImpl;

public class HospitalRulesStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in HostelRulesStarter");
        HospitalRules hospitalRules=new HospitalRulesImpl() ;
        hospitalRules.noSmoking();
        hospitalRules.dontMakeNoice();
        hospitalRules.keepSilence();
        hospitalRules.maintainClinelyness();
        System.out.println("Hospital name is :"+ HospitalRules.NAME);
        System.out.println("Hospital location is :"+ HospitalRules.LOCATION);
        System.out.println("Ending main in HostelRulesStarter");
    }

}
