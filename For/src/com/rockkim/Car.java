package com.rockkim;

//other classes have access to public
//other classes do not have access to private
public class Car {

     private int doors;
     private int wheels;
     private String model;
     private String engine;
     private String color;

     //void doesnt return data - no return needed
     public void setDoors(int doors) {
         this.doors = doors;
     }

     public int getDoors() {
          return this.doors;
     }
}

