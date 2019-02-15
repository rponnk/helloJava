package com.rockkim;

public class Dimensions {
    private int height;
    private int width;
    private int depth;
    private int buttons;

    public Dimensions(int height, int width, int depth, int buttons) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.buttons = buttons;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getButtons() {
        return buttons;
    }
}
