package com.rockkim;

public class Monitor {
    private String model;
    private int size;
    //created Resolution file(this is composition)
    private Resolution nativeResolution;

    public Monitor(String model, int size, Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y) {
        System.out.println("Resolution is " + x + " x " + y);
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
