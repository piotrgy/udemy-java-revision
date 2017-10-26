package com.timbuchalka.bankingapplication;


import java.util.ArrayList;

public class Branch {
    private int branchID;
    private ArrayList<Customer> customers;
    private static final String[] MESSAGE = {"That customer exists already."};

    public Branch(int branchID) {
        this.branchID = branchID;
        this.customers = new ArrayList<>();
    }

    public int getBranchID() {
        return branchID;
    }

    public boolean addCustomerInBranch(String name, double amount) {
        int customerIndex = findCustomerInBranch(name);
        if (customerIndex >=0) {
            displayMessage(0);
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

    public int findCustomerInBranch(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public void displayCustomers(boolean withTransactions) {
        System.out.println("Customers of branch number " + this.branchID + ":");
        int numberOfCustomer = 1;
        if (withTransactions) {
            for (Customer customer : customers) {
                System.out.println(numberOfCustomer + ". " + customer.getName() + ",");
                customer.displayTransactions();
                numberOfCustomer ++;
            }
        } else {
            for (Customer customer : customers) {
                System.out.println(numberOfCustomer + ". " + customer.getName() + ",");
                numberOfCustomer ++;
            }
        }

    }

    private void displayMessage(int messageId) {
        System.out.println(MESSAGE[messageId]);
    }
}
