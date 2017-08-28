package com.timbuchalka.billburgers;

/**
 * Section 8, Lecture 50
 */
public class Hamburger {
    private String breadRollType;
    private String meat;
    private double lettuce;
    private double tomato;
    private double carrot;
    private double onion;

    protected double price;

    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.lettuce = 0;
        this.tomato = 0;
        this.carrot = 0;
        this.onion = 0;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getChips() {
        return carrot;
    }

    public double getDrinks() {
        return onion;
    }

    public double getPrice() {
        return price;
    }

    public void addLettuce(double lettuce) {
        if (this.lettuce > 0) {
            this.lettuce = lettuce;
            price += this.lettuce;
        } else {
            System.out.println("You have enough of lettuce!");
        }

    }

    public void addTomato(double tomato) {
        if (this.tomato > 0) {
            this.tomato = tomato;
            price += this.tomato;
        } else {
            System.out.println("You have enough of tomato!");
        }
    }

    public void addCarrot(double carrot) {
        if (this.carrot > 0) {
            this.carrot = carrot;
            price += this.carrot;
        } else {
            System.out.println("You have enough of carrot!");
        }
    }

    public void addOnion(double onion) {
        if (this.onion > 0) {
            this.onion = onion;
            price += this.onion;
        } else {
            System.out.println("You have enough of onion!");
        }
    }
}
