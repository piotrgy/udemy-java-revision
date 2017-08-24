package com.timbuchalka.composition;

/**
 * Created by piotr_gy on 21.08.17.
 */
public class Chair {
    private int legs;

    public Chair(int legs) {
        this.legs = legs;
        System.out.println("The chair has now "+legs+" legs."
        );
    }

    public int getLegs() {
        return legs;
    }
}
