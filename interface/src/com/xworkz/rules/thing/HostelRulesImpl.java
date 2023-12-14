package com.xworkz.rules.thing;

public class HostelRulesImpl implements HostelRules {
    @Override
    public boolean offersBasic() {
        System.out.println("methos offerBasic implemented");
        return false;
    }

    @Override
    public void sharedAccommodations() {
        System.out.println("method sharedAccommodation implemented");

    }

    @Override
    public boolean FacilitatingTravelerNeeds() {
        System.out.println("method FacilitatingTravelerNeeds implemented");
        return false;
    }
        @Override
                public boolean FacilitiesandServices(){
            System.out.println("method FacilitiesandServices implemented");
            return false;
        }

}
