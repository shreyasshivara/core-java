package com.xworkz.rules.runner;

import com.xworkz.rules.thing.HostelRules;
import com.xworkz.rules.thing.HostelRulesImpl;

public class HostelRulesRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in HostelRulesRunner");
        HostelRulesImpl hostelRules=new HostelRulesImpl();
        hostelRules.FacilitatingTravelerNeeds();
        hostelRules.FacilitiesandServices();
        hostelRules.offersBasic();
        hostelRules.sharedAccommodations();
        String time = HostelRulesImpl.TIME;
        //System.out.println("time:"+time);
        System.out.println("Hostel_for:"+HostelRules.Hostel_for);

        System.out.println("Timings:"+HostelRulesImpl.Hostel_for);
        String hostel =HostelRulesImpl.Hostel_for;

        //System.out.println("hosrel for:"+hostel);



        System.out.println("ending main in HostelRulesRunner");
    }
}
