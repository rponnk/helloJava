package com.rockkim;

public class Case {
    private String psu;
    private String model;
    private Dimensions dimensions;

    public Case(String psu, String model, Dimensions dimensions) {
        this.psu = psu;
        this.model = model;
        this.dimensions = dimensions;
    }

    public void pressPower() {
        System.out.println("power button was pressed");
    }
    public String getPsu() {
        return psu;
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
