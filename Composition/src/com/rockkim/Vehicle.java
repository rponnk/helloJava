package com.rockkim;

public class Vehicle {
    private int engine;
    private int doors;
    private int wheels;
    private String model;

    public Vehicle(int engine, int doors, int wheels, String model) {
        this.engine = engine;
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
