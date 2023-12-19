package com.xworkz.rules.thing;

public class CourtRulesImpl implements CourtRules{
    @Override
    public boolean noSmooking(){

        System.out.println("method noSmooking is implemented");
        return false;
    }
    @Override
    public void dontMakeNoise(){
        System.out.println("MEthod dontMakeNoise is implemented");

    }

    @Override
    public void ObeyORder() {
        System.out.println("method ObeyOrder is implemented");

    }

    @Override
    public void respectCourt() {
        System.out.println("method respectCourt is implemented");

    }


}
