package com.timbuchalka.scope;

public class X {
    public int x;

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " * " + this.x + " = " + x * this.x);
        }
    }
}
