package com.rockkim;

public class Main {

    public static void main(String[] args) {

        Case theCase = new Case("850 Gold", "Corsair", new Dimensions(20, 20));
        Monitor theMonitor = new Monitor("asus", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("asrock", 4);

        PC thePC = new PC(theMonitor, theMotherboard, theCase);
//        thePC.getTheCase().pressPower();
//        thePC.getMotherboard().loadProgram("Windows 10");
//        thePC.getTheMonitor().drawPixelAt(2540,1440);
        thePC.powerUp();

    }
}
