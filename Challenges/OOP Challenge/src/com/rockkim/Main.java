package com.rockkim;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger cheeseBurger = new Hamburger(2, 2, "potato Bread", 2, 2, 4, new Condiments(0, 0));
        cheeseBurger.burgerSelected();
        cheeseBurger.totalPrice();
    }
}
