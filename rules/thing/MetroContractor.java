package com.xworkz.rules.thing;

public class MetroContractor extends Contractor implements GarbageRule{
    @Override
    public boolean segregation() {

        return false;
    }

    @Override
    public boolean recycle()
    {
        return false;
    }


}
