package com.rockkim;

public class Motherboard {
    private String model;
    private int dimSlots;

    public Motherboard(String model, int dimSlots) {
        this.model = model;
        this.dimSlots = dimSlots;
    }
    public void loadProgram(String program) {
        System.out.println(program + " was loaded");
    }

    public String getModel() {
        return model;
    }

    public int getDimSlots() {
        return dimSlots;
    }
}
