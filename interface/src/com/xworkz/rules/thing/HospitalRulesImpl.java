package com.xworkz.rules.thing;

public class HospitalRulesImpl implements HospitalRules {
    @Override
    public boolean noSmoking(){
        System.out.println("method noSmoling is implemented");
        return false;
    }

    @Override
    public void keepSilence() {
        System.out.println("method keepSilence implemented");
    }

    @Override
    public void dontMakeNoice() {
        System.out.println("method dontMAkeNoice is implemented");

    }

    @Override
    public void maintainClinelyness() {
        System.out.println("method maintainClinelyness is implemented");

    }

}
