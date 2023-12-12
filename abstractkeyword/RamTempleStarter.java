package com.xworkz.abstractkeyword;

public class RamTempleStarter {
    public static void main(String[] args) {
        System.out.println("Starting main in RamTempleStarter");
        Temple temple=new RamTemple();
        temple.planning();
        temple.inauguration();
        System.out.println("Ending main in RamTempleStarter");
    }
}
