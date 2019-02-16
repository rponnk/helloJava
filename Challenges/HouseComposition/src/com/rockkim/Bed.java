package com.rockkim;

public class Bed {
    private String size;
    private int width;
    private int length;

    public Bed(String size, int width, int length) {
        this.size = size;
        this.width = width;
        this.length = length;
    }

    public void getBedSize() {
        System.out.println("The bed is a " + size + " its " + width + " x " + length);
    }

    private String getSize() {
        return size;
    }

    private int getWidth() {
        return width;
    }

    private int getLength() {
        return length;
    }
}
