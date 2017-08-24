package com.timbuchalka.encapsulation;

/**
 * Created by piotr_gy on 22.08.17.
 */
public class Printer {
    private int tonerLevel = 50;
    private int pagesPrinted = 0;
    private boolean isDuplex = true;

    public void fillUpTheToner(int amount) {
        final int MAX_TONER_LEVEL = 100;
        this.tonerLevel = this.tonerLevel + amount;
        if (this.tonerLevel > MAX_TONER_LEVEL) {
            this.tonerLevel = MAX_TONER_LEVEL;
        }
    }

    public void printPage(int amount) {
        this.pagesPrinted = this.pagesPrinted + amount;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
