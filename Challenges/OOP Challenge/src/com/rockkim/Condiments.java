package com.rockkim;

public class Condiments {
    private int ketchupSquirts;
    private int mustardSquirts;

    public Condiments(int ketchupSquirts, int mustardSquirts) {
        this.ketchupSquirts = ketchupSquirts;
        this.mustardSquirts = mustardSquirts;
    }

    public String getCondiments() {
        if(this.ketchupSquirts >= 1 || this.mustardSquirts >= 1) {
            return "condiments added";
        } else {
            return "no condiments";
        }
    }
}
