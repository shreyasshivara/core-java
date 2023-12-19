package com.xworkz.rules.thing;


public  class Contractor extends AbstractSawageRule implements BBMPRule{
    public  Contractor(){
        System.out.println("Starting contractor");
    }

    @Override
    public boolean payWaterBill() {
        return false;
    }
    @Override
    public boolean followRules() {
        return false;
    }

    @Override
    public boolean leading() {
        return false;
    }

    @Override
    public boolean payTax() {
        return false;
    }

    @Override
    public boolean primaryTreatment() {
        return false;
    }

    @Override
    public boolean secondaryTreatment() {
        return false;
    }

    @Override
    public boolean siteAllotment() {
        return false;
    }

    @Override
    public boolean provideFacilities() {
        return false;
    }
}
