package com.timbuchalka.inheritence1;

/**
 * Created by piotr_gy on 18.08.17.
 */
public class Truck extends Car {
    private final int FULL = 2;
    private final int EMPTY = 0;

    private int trailer;

    public void addTrailer() {
        if (trailer < FULL) {
            trailer++;
        }
    }

    public void removeTrailer() {
        if (trailer > EMPTY) {
            trailer--;
        }
    }

}
