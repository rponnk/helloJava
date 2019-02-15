package com.rockkim;

public class Vehicle {
    private String name;
    private String make;
    private String model;
    private String color;
    private String year;
    private int topspeed;
    private int seats;
    private int doors;

    public Vehicle(String name, String make, String model, String color, String year, int topspeed, int seats, int doors) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.topspeed = topspeed;
        this.seats = seats;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getTopspeed() {
        return topspeed;
    }

    public void setTopspeed(int topspeed) {
        this.topspeed = topspeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
