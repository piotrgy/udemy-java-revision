package com.timbuchalka;

/**
 * Created by piotr_gy on 09.08.17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default Name", 1000.0, "default@email.com");
        System.out.println("Default constructor called.");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
        System.out.println("2 parameter constructor called.");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("3 parameter constructor called.");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void printFields() {
        System.out.println(getName());
        System.out.println(getCreditLimit());
        System.out.println(getEmailAddress());
    }
}
