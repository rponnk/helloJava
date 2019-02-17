package com.rockkim;

import java.text.DecimalFormat;

public class Hamburger {
    private int burger;
    private int cheeseSlice;
    private String bread;
    private int lettuce;
    private int tomato;
    private int pickles;
    private Condiments condiments;

    public Hamburger(int burger, int cheeseSlice, String bread, int lettuce, int tomato, int pickles, Condiments condiments) {
        this.burger = burger;
        this.cheeseSlice = cheeseSlice;
        this.bread = bread;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.condiments = condiments;
    }

    public void burgerSelected() {
        if(lettuce >= 1 || tomato >=1 || pickles >= 1) {
            System.out.println("You selected the deluxe Cheeseburger");
            System.out.println("You ordered a burger with " + this.burger + " patties and  " + this.cheeseSlice + " slices of cheese on "
                    + this.bread + " with " + this.lettuce + " pieces of lettuce with " + this.tomato + " slices of tomatoes  and " + this.pickles + " slices of pickles" );
            System.out.println("you also added " + condiments.getCondiments());
        } else if(burger >=2 ) {
            System.out.println("you ordered a double cheese");
        } else {
            System.out.println("you selected a regular burger");
        }
    }

    public void totalPrice() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");
         double burgerPrice = this.burger * 1.62;
         double cheesePrice = this.cheeseSlice * .50;
         double lettuce = this.lettuce * .12;
         double pickle = this.pickles * .12;
         double tomato = this.tomato * .22;
         double total = burgerPrice + cheesePrice + lettuce + pickle + tomato;
        System.out.println("Your total price: $" + numberFormat.format(total) + " cents");
    }

}
