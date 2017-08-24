package com.timbuchalka.composition;

/**
 * Created by piotr_gy on 21.08.17.
 */
public class Room {
    private LightSource lightSource;
    private Door door;
    private Chair chair;

    public Room(LightSource lightSource, Door door, Chair chair) {
        this.lightSource = lightSource;
        this.door = door;
        this.chair = chair;
    }

    public void allFields() {
        System.out.println("Light brights "+lightSource.getColour());
        System.out.println("Door open is "+door.isOpen());
        System.out.println("Chair has "+chair.getLegs()+" legs.");
    }

    public LightSource getLightSource() {
        return lightSource;
    }

    public Door getDoor() {
        return door;
    }

    public Chair getChair() {
        return chair;
    }
}
