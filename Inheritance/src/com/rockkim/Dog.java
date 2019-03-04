package com.rockkim;

public class Dog extends Animal {
    private boolean tail;
    private String hairLength;

    public Dog(String name, String type, int brain, int body, String size, int weight, boolean tail, String hairLength) {
        super(name, type, brain, body, size, weight);
        this.hairLength = hairLength;
        this.tail = tail;
    }

    public void size() {
        int weight = this.getWeight();
        if(weight <= 25 ) {
            System.out.println("the animal is small");
        } else {
            System.out.println("the animal is medium or large");
        }
    }

    public void age(int age) {
        years(age);
    }

    public void years(int age) {
        if(age < 2) {
            System.out.println("aww they are still a puppy");
        } else if(age > 3 || age < 6) {
            System.out.println("Teenage years for these bois or girls");
        } else {
            System.out.println("adult animal, but I still adore them");
        }
    }

    @Override
    public void eat() {
        System.out.println("dogs love to eat everything");
    }
}
