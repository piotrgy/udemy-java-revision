package com.timbuchalka.composition;

/**
 * Created by piotr_gy on 21.08.17.
 */
public class Door {
    private boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
        System.out.println("The door is now "+isOpen+" open.");
    }

    public boolean isOpen() {
        return isOpen;
    }
}
