package com.rockkim;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
       this.health -= damage;
       if(this.health <= 0 ) {
           System.out.println("Player knocked out");
       }
    }

    public int healthRemaining() {
        return this.health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
