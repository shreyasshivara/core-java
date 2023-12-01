package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.WifiDongle;

public class WIfiDongleStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in WIfiDongleStarter");
        WifiDongle wifiDongle=new WifiDongle("VCR",950,50);
        WifiDongle wifiDongle1=new WifiDongle("wayona",950,50);
        boolean same=wifiDongle.equals(wifiDongle1);
        System.out.println(same);
        System.out.println("Ending main in WIfiDongleStarter");


    }
}
