package com.infy.string;

public class LocationTester {
    public static void main(String[] args) {
        LocationChanger lc = new LocationChanger();
        lc.setName("Annabelle Michael");
        lc.setLocation("BL003,Delhi,STP");
        lc.welcomeEmployee();
        lc.checkCity();
        lc.editAddress();
        lc.setName("Jissele James");
        lc.setLocation("FL091,Pune,SEZ");
        lc.welcomeEmployee();
        lc.checkCity();
        lc.editAddress();
    }
}
