package com.rockkim;

public class Printer {
    private int blackLevel;
    private int paper;
    private int printed;
    private boolean dulexePrinter;


    public Printer(int blackLevel, int paper, int printed, boolean dulexePrinter) {
        if(blackLevel > 0 && blackLevel <= 100) {
            this.blackLevel = blackLevel;
        } else {
            System.out.println("refill toner");
        }

        if(paper > 0 && paper <= 50) {
            this.paper = paper;
        }
        this.printed = printed;
        this.dulexePrinter = dulexePrinter;

    }

    public void printerInfo() {
        this.paper -= this.printed;
        System.out.println(blackLevel + " black remaining, " + paper + " remains " + printed + " printed ");
    }

}
//
//package com.rockkim;
//
//public class EnhancedPlayer {
//    private String name;
//    private int hitPoints;
//    private String weapon;
//
//    public EnhancedPlayer(String name, int health, String weapon) {
//        this.name = name;
//        if(health > 0 && health <= 100){
//            this.hitPoints = health;
//        }
//        this.weapon = weapon;
//    }
//
//    public void loseHealth(int damage) {
//        this.hitPoints -= damage;
//        if(this.hitPoints <= 0 ) {
//            System.out.println("Player knocked out");
//        } else {
//            System.out.println(this.hitPoints);
//        }
//    }
//
//    public int getHealth() {
//        return hitPoints;
//    }
//}