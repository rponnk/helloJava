package com.rockkim;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int dimSlots;
    private int driveSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int dimSlots, int driveSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimSlots = dimSlots;
        this.driveSlots = driveSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("load Program is called" + programName + " is called");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDimSlots() {
        return dimSlots;
    }

    public int getDriveSlots() {
        return driveSlots;
    }

    public String getBios() {
        return bios;
    }
}
