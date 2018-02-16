package com.timbuchalka.thefantasygame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//section 10, lecture 76 - Interfaces Challenge

public class Main {
    public static void main(String[] args) {
        ISaveable wizard = new Wizard();
        ISaveable warrior = new Warrior();

        System.out.println("Info for wizard.");
        saveToGameHero(wizard);
        System.out.println("Info for warrior.");
        saveToGameHero(warrior);

        System.out.println("Displaying objects by implemented method.");
        List list = wizard.returnListOfValues();
        System.out.println(list);

        list = warrior.returnListOfValues();
        System.out.println(list);

        System.out.println("Displaying objects by toString method.");
        System.out.println(wizard);
        System.out.println(warrior);
    }

    private static void saveToGameHero(ISaveable hero) {
        hero.populateObjectsFields(readValues());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
