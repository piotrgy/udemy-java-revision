package com.timbuchalka.composition;

/**
 * Created by piotr_gy on 21.08.17.
 */
public class LightSource {
    private String colour;

    public LightSource(String colour) {
        this.colour = colour;
        System.out.println("Light brights in "+colour+" colour.");
    }

    public String getColour() {
        return colour;
    }
}
