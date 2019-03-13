package com.rockkim;

public class Printer {
    private int blackLevel;
    private int paper;
    private int printed;
    private boolean duplexePrinter;


    public Printer(int blackLevel, int paper, int printed, boolean duplexePrinter) {
        if(blackLevel > 0 && blackLevel <= 100) {
            this.blackLevel = blackLevel;
        } else {
            System.out.println("refill toner");
        }

        if(paper > 0 && paper <= 50) {
            this.paper = paper;
        }
        this.printed = printed;
        if(duplexePrinter) {
            this.duplexePrinter = duplexePrinter;
            System.out.println(printed / 2 + " pages printed");
        } else {
            System.out.println("not a duplexe printer");
        }


    }

    public void printerInfo() {
        this.paper -= this.printed;
        System.out.println(blackLevel + " black remaining, " + paper + " remains " + printed + " printed ");
    }

}
