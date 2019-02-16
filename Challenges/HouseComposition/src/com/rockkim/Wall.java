package com.rockkim;

public class Wall {
    private int walls;

    public Wall(int walls) {
        this.walls = walls;
    }

    public void wallCount() {
        System.out.println("Youre staring at the " + walls + " walls");
    }

    private int getWalls() {
        return walls;
    }
}
