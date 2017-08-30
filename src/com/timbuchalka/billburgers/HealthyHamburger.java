package com.timbuchalka.billburgers;

/**
 * Section 8, Lecture 50
 */
public class HealthyHamburger extends Hamburger {

    private double broccoli;
    private double radish;

    public HealthyHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.broccoli = 0;
        this.radish = 0;
    }

    public double getBroccoli() {
        return broccoli;
    }

    public double getRadish() {
        return radish;
    }

    public void addBroccoli(double broccoli) {
        if (this.broccoli == 0) {
            this.broccoli = broccoli;
            price += this.broccoli;
        } else {
            System.out.println("You have enough of broccoli!");
        }
    }

    public void addRadish(double radish) {
        if (this.radish == 0) {
            this.radish = radish;
            price += this.radish;
        } else {
            System.out.println("You have enough of radish!");
        }
    }
}
