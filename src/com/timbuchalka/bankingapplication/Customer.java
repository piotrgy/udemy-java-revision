package com.timbuchalka.bankingapplication;


import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    private static final String[] MESSAGE = {"The initial amount of money should be greater or equal to 0.", "There's not enough money on your account."};

    public Customer(String name, double amount) {
        this.name = name;
        if (amount < 0) {
            displayMessage(0);
        }else transactions.add(amount);

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

    private void displayMessage(int messageId) {
        System.out.println(MESSAGE[messageId]);
    }
}
