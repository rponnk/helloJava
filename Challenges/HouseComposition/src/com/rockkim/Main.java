package com.rockkim;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bed theBed = new Bed("Queen", 60, 70);
        Wall theWalls = new Wall(4);

        BR bedRoom = new BR(theWalls, theBed);
        bedRoom.roomDetails();
    }
}
