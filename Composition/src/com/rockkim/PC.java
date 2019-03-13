package com.rockkim;

public class PC {
    private Monitor theMonitor;
    private Motherboard motherboard;
    private Case theCase;

    public PC(Monitor theMonitor, Motherboard motherboard, Case theCase) {
        this.theMonitor = theMonitor;
        this.motherboard = motherboard;
        this.theCase = theCase;
    }

    public void powerUp() {
        theCase.pressPower();
        drawLogo();
        biosStart();
    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1920, 1080);
    }

    private void biosStart() {
        motherboard.loadProgram("Windows 10");
    }

}
