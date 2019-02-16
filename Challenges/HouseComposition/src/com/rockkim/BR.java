package com.rockkim;

public class BR {

    private Wall theWall;
    private Bed theBed;

    public BR( Wall theWall, Bed theBed) {
        this.theWall = theWall;
        this.theBed = theBed;
    }

    public void roomDetails() {
        theBed.getBedSize();
        theWall.wallCount();
    }
}
