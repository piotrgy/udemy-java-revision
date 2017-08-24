package com.timbuchalka.polymorphysm;

/**
 * Created by piotr_gy on 23.08.17.
 */
public class Car {
    protected boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        System.out.println("Car is created.");
    }

    public void engineStart() {
        if (this.engine == false) {
            this.engine = true;
        }
        System.out.println("Car's engine is "+this.engine+" started.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }


}

class Ford extends Car {
    public Ford(int cylinders) {
        super(cylinders);
        System.out.println("Ford is created.");
    }

    @Override
    public void engineStart() {
        super.engineStart();
        System.out.println("Ford's engine is "+this.engine+" started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Ford is braking.");
    }

    public static void main(String[] args) {
        Car ford = new Ford(3);
        ford.engineStart();
        ford.accelerate();
        ford.brake();

        Car citroen = new Citroen(4);
        citroen.engineStart();
        citroen.accelerate();
        citroen.brake();
    }
}

class Citroen extends Car {
    public Citroen(int cylinders) {
        super(cylinders);
        System.out.println("Citroen is created.");
    }

    @Override
    public void engineStart() {
        super.engineStart();
        System.out.println("Citroen's engine is "+this.engine+" started.");

    }

    @Override
    public void accelerate() {
        System.out.println("Citroen is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Citroen is braking.");
    }
}

