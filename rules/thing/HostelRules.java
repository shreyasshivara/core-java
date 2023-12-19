package com.xworkz.rules.thing;

public interface HostelRules {
    public String TIME="6am-10pm";
    public String Hostel_for="boys";

     abstract  boolean offersBasic();
     void sharedAccommodations();
    abstract boolean FacilitatingTravelerNeeds();
    abstract  boolean FacilitiesandServices();


}
