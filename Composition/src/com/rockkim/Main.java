package com.rockkim;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Dimensions dimensions = new Dimensions(32, 10, 5);
        //the dimensions is a argument in the parameter, however were calling a variable here instead
        Case theCase = new Case("Corsair X552", "Corsair", "Corsair 850 Gold", new Dimensions(32,10,5));
        Monitor theMontior = new Monitor("Asus G-Sync", "Asus", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("LGA 1151", "Asus", 2, 5, "v1.0.0");

        PC thePC = new PC(theCase, theMontior, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200, "red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPower();
    }
}
