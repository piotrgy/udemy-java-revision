package com.timbuchalka.billburgers;

/**
 * Section 8, Lecture 50
 */
public class DeluxeHamburger extends Hamburger {

    private double chips;
    private double drinks;

    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.chips = 0;
        this.drinks = 0;
    }

    public double getChips() {
        return chips;
    }

    public double getDrinks() {
        return drinks;
    }

    public void addChips(double chips) {
        if (this.chips == 0) {
            this.chips = chips;
            price += this.chips;
        } else {
            System.out.println("You have enough of chips!");
        }
    }

    public void addDrinks(double drinks) {
        if (this.drinks == 0) {
            this.drinks = drinks;
            price += this.drinks;
        } else {
            System.out.println("You have enough of drinks!");
        }
    }
}
