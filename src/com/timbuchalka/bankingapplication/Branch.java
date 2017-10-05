package com.timbuchalka.bankingapplication;


import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;

    public boolean addCustomerInBranch(String name, double amount) {
        int customerIndex = findCustomerInBranch(name);
        if (amount < 0 || customerIndex >=0) {
            return false;
        }
        Customer newCustomer = new Customer(name, amount);
        this.customers.add(newCustomer);
        return true;
    }

    public boolean addTransactionInBranch(String name, double amount) {
        int customerIndex = findCustomerInBranch(name);
        if (customerIndex >= 0) {
            this.customers.get(customerIndex).addTransaction(amount);
            return true;
        }
        return false;
    }

    private int findCustomerInBranch(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }
        return -1;
    }
}
