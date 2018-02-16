package com.timbuchalka.thefantasygame;

import java.util.ArrayList;
import java.util.List;

public class Warrior implements ISaveable {

    private String name;
    private String weapon;
    private String moving;

    @Override
    public List<String> returnListOfValues() {
        System.out.println("Attributes of Warrior: ");
        List<String> outputList = new ArrayList<>();
        outputList.add(name);
        outputList.add(weapon);
        outputList.add(moving);
        return outputList;
    }

    @Override
    public void populateObjectsFields(List listOfValues) {
        if (listOfValues.size() != 3) {
            System.out.println("Wrong list of attributes for a warrior.");
        } else {
            name = listOfValues.get(0).toString();
            weapon = listOfValues.get(1).toString();
            moving = listOfValues.get(2).toString();
        }
    }

    @Override
    public String toString() {
        return "Warrior "
                + "has name: " + name
                + ", weapon: " + weapon
                + " and moving by: " + moving + '.';
    }
}