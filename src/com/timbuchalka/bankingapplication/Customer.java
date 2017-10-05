package com.timbuchalka.bankingapplication;


import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double amount) {
        this.name = name;
        this.addTransaction(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean addTransaction(double amount) {
        if (amount < 0) {
            double sum = 0;
            for (double transaction : this.getTransactions()) {
                sum += transaction;
            }
            if (sum < Math.abs(amount)) {
                return false;
            }
        }
        this.transactions.add(amount);
        return  true;
    }
}
