package com.timbuchalka.thefantasygame;

import java.util.List;

public interface ISaveable {
    List returnListOfValues();

    void populateObjectsFields(List listOfValues);
}