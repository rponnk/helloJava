package com.rockkim;

public class Mac {
    private Monitor monitor;
    private Motherboard motherboard;

    public Mac(Monitor monitor, Motherboard motherboard) {
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
