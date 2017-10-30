package com.timbuchalka.bankingapplication;


import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private static final String[] MESSAGE = {"That branch exists already.", "Can't find that branch."};

    public boolean addBranch(int branchID) {
        if (findBranch(branchID) >= 0) {
            displayMessage(0);
            return false;
        }
        Branch branch = new Branch(branchID);
        branches.add(branch);
        return true;
    }

    public int findBranch(int branchID) {
        for (int i = 0; i < branches.size(); i++) {
            int id = branches.get(i).getBranchID();
            if (id == branchID) {
                return i;
            }
        }
        return -1;
    }

    private void displayMessage(int messageId) {
        System.out.println(MESSAGE[messageId]);
    }

    public boolean addCustomerToBank(int branchID, String customerName, double initialTransaction) {
        int branchIndex = findBranch(branchID);
        if (branchIndex >= 0) {
            branches.get(branchIndex).addCustomerInBranch(customerName, initialTransaction);
            return true;
        }
        displayMessage(1);
        return false;
    }

    public boolean addCustomersTransaction(int branchID, String customerName, double amount) {
        int branchIndex = findBranch(branchID);
        if (branchIndex >= 0) {
            branches.get(branchIndex).addTransactionInBranch(customerName, amount);
            return true;
        }
        displayMessage(1);
        return false;
    }

}