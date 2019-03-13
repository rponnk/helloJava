package com.rockkim;

public class Main {

    public static void main(String[] args) {
	 //write your code here
        Player player = new Player();
        player.name =  "Alita";
        player.health = 20;
        player.weapon = "sword";

        System.out.println(player.getName());

        int damage = 10;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println(player.healthRemaining());

          EnhancedPlayer miko = new EnhancedPlayer("Miko", 100, "numb chukas");
          miko.loseHealth(15);

    }
}
