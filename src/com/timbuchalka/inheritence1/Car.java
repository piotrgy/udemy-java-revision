package com.timbuchalka.inheritence1;

/**
 * Created by piotr_gy on 18.08.17.
 */
public class Car extends Vehicle {
    private final int IDLE = 0;
    private final int LAST = 8;

    private int gear;

    public void gearUp() {
        if (gear < LAST) {
            gear++;
            System.out.println("Car.gearUp called, now it's "+gear+" gear.");
        }

    }

    public void gearDown() {
        if (gear > IDLE) {
            gear--;
            System.out.println("Car.gearDown called, now it's "+gear+" gear.");
        }
    }

}
