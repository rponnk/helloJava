package com.rockkim;

public class Chicken extends Animal {
    //unique to chicken,
    private String coat;
    private int talons;
    private int beak;
    private int feet;

    public Chicken(String name, String type, int brain, int body, String size, int weight, String coat, int talons, int beak, int feet) {
        super(name, type, 1, body, size, weight);
        this.beak = beak;
        this.coat = coat;
        this.feet = feet;
        this.talons = talons;
    }
     private void chew() {
         System.out.println("Chickens don't chew food, they swallow whole");
     }

    @Override
    public void eat() {
        chew();
        //super.eat(); - super calls the eat method from the extended file
    }

    public void speed(int mph) {
        if(mph <= 5) {
            System.out.println("the chicken is walking");
        } else {
            System.out.println("the chicken is running");
        }
    }


    public void flies(boolean fly) {
        if(fly == true) {
            System.out.println("Chickens can fly");
        } else {
            System.out.println("Chickens can't fly");
        }
    }
}
