package com.timbuchalka.bankingapplication;

public class BankApp {
    private static Bank myBank;
    public static void main(String[] args) {
        myBank = new Bank();

        String[] names1 = {"John", "Anna", "Chris"};
        double[] initials1 = {12.34, 23.90, -19.87};

        String[] names2 = {"Jack", "Alice", "Christina"};
        double[] initials2 = {-14.34, 21.90, -9.87};

        String[] names3 = {"Jill", "Andrew", "Cynthia"};
        double[] initials3 = {54.30, 27.03, 89.10};

        for (int i = 1; i < 4; i++) {
            myBank.addBranch(i);
        }

        bankBuilder(1, names1, initials1);
        bankBuilder(2, names2, initials2);
        bankBuilder(3, names3, initials3);
        bankBuilder(4, names3, initials3);

        myBank.displayListOfCustomers(true);

        myBank.addCustomersTransaction(1, "Anna", 25.0);
        myBank.addCustomersTransaction(2, "Alice", -35.0);
        myBank.addCustomersTransaction(3, "John", -5.0);
        myBank.addCustomersTransaction(4, "Cynthia", -80.0);

        myBank.displayListOfCustomers(true);
    }

    private static void bankBuilder(int branchId, String[] names, double[] initials) {
        int counter = 0;
        for (int i = 0; i < names.length; i++) {
            if (myBank.addCustomerToBank(branchId, names[i], initials[i])) counter++;
        }
        System.out.println("Branch " + branchId + " created with " + counter + " customer/s.");
    }
}
