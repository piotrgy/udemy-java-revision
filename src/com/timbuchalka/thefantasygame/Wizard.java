package com.timbuchalka.thefantasygame;

import java.util.ArrayList;
import java.util.List;

public class Wizard implements ISaveable {
    private String name;
    private String power;
    private String moving;

    @Override
    public List<String> returnListOfValues() {
        System.out.println("Attributes of Wizard: ");
        List<String> outputList = new ArrayList<>();
        outputList.add(name);
        outputList.add(power);
        outputList.add(moving);
        return outputList;
    }

    @Override
    public void populateObjectsFields(List listOfValues) {
        if (listOfValues.size() != 3) {
            System.out.println("Wrong list of attributes for a wizard.");
        } else {
            name = listOfValues.get(0).toString();
            power = listOfValues.get(1).toString();
            moving = listOfValues.get(2).toString();
        }
    }

    @Override
    public String toString() {
        return "Wizard "
                + "has name: " + name
                + ", power: " + power
                + " and moving by: " + moving + '.';
    }
}
