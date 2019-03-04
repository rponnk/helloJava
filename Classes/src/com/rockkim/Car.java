package com.rockkim;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String make;

    public void setModel(String model) {
        this.model = model;
        System.out.println("Model = " + model);
    }
}
