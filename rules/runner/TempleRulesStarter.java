package com.xworkz.rules.runner;

import com.xworkz.rules.thing.TempleRules;
import com.xworkz.rules.thing.TempleRulesImpl;

public class TempleRulesStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in TEmpleRulesStarter");
        TempleRulesImpl templeRules=new TempleRulesImpl();
        templeRules.wearTerditionalwares();
        templeRules.dontTakePicture();
        templeRules.keepSilence();
        templeRules.switchOffMobiles();
        System.out.println("Temple name:"+TempleRules.TEMPLENEME);
        System.out.println("Temple place:"+ TempleRules.TEMPLELOCATION);
        System.out.println("Ending main in TEmpleRulesStarter");
    }
}
