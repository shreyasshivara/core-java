package com.work.shreyas.defaultmethod.starter;

import com.work.shreyas.defaultmethod.thing.UsbHub;

public class UsbHubStarter {
    public static void main(String[] args) {
        System.out.println("starting main in UsbHubStarter");

        UsbHub usbHub=new UsbHub(4,950,5);
        UsbHub usbHub1=new UsbHub(4,950,5);
        boolean same=usbHub.equals(usbHub1);
        System.out.println(same);
        System.out.println(usbHub);
        System.out.println(usbHub1);

        System.out.println("Ending main in UsbHubStarter");
    }
}
