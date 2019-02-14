package com.rockkim;

public class Main {

    //method
    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car audi = new Car();
        //in order to use the variables inside of Car.java, need to change to public. Other wise if private it can only be used in that class/file
        //however its best to create a public method that uses those private variables
        porsche.setDoors(4);
        System.out.println("The Porsche has " + porsche.getDoors() + " doors.");

    }
}
