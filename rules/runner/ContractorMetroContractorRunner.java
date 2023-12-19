package com.xworkz.rules.runner;

import com.xworkz.rules.thing.Contractor;
import com.xworkz.rules.thing.MetroContractor;

public class ContractorMetroContractorRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ContractorMetroContractorRunner");
        Contractor contractor=new Contractor();
        contractor.primaryTreatment();
        contractor.secondaryTreatment();
        contractor.payTax();
        contractor.payWaterBill();
        contractor.provideFacilities();
        contractor.siteAllotment();

        MetroContractor metroContractor=new MetroContractor();
        metroContractor.segregation();
        metroContractor.payTax();
        metroContractor.recycle();
        metroContractor.payWaterBill();



        System.out.println("Ending main in ContractorMetroContractorRunner");
    }
}
