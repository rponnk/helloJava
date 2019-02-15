package com.rockkim;

import java.awt.*;

public class Case {
   private String model;
   private String manufacturer;
   private String psu;
   private Dimensions dimension;

    public Case(String model, String manufacturer, String psu, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.psu = psu;
        this.dimension = dimension;
    }

    public void pressPower() {
        System.out.println("you have pressed power button");
    }

    public void resetButton() {
        System.out.println("restarting your computer...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPsu() {
        return psu;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
