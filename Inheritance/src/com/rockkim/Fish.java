package com.rockkim;

public class Fish extends Animal {
    private boolean gills;
    private int eyes;
    private int fins;

    public Fish(String name, String type, int brain, int body, String size, int weight, boolean gills, int eyes, int fins) {
        super(name, type, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void moves(int mph) {
        speed(mph);
    }

    private void speed(int mph) {
        if(mph <= 5) {
            System.out.println("the fish is swimming slow at " + mph + " mph");
        } else {
            System.out.println("the fish is swimming fast at " + mph + " mph");
        }
    }

}
