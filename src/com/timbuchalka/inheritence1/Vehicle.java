package com.timbuchalka.inheritence1;

/**
 * Created by piotr_gy on 18.08.17.
 */
public class Vehicle {
    private int speed;
    public void increaseSpeed() {
        speed++;
        System.out.println("Vehicle.increaseSpeed called at speed: "+speed);
    }

    public void decreaseSpeed() {
        if (speed > 0) {
            speed--;
            System.out.println("Vehicle.decreaseSpeed called at speed: "+speed);
        }

    }

}
