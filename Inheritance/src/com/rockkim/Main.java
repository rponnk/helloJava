package com.rockkim;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chicken chicken = new Chicken("Ollie", "bird", 1, 1, "small", 14, "feathers", 6, 1, 2);
        chicken.eat();
        System.out.println(chicken.getName());
        chicken.speed(5);
        chicken.flies(false);

        Fish fish = new Fish("Goldie", "bluegill", 1, 1, "small", 3, true, 2, 5);
        fish.moves(10);
    }
}
