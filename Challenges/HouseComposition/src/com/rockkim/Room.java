package com.rockkim;

public class Room {
    private String name;
    private Bed bed;
    private Wall wall;

    public Room(String name, Bed bed, Wall wall) {
        this.name = name;
        this.bed = bed;
        this.wall = wall;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Wall getWall() {
        return wall;
    }
}
