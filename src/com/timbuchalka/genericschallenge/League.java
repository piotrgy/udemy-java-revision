package com.timbuchalka.genericschallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends TeamSport>{
    private ArrayList<Team<T>> teams;

    public League() {
        teams = new ArrayList<>();
    }

    boolean addTeam (Team<T> team){
        if(teams.contains(team))
            return false;
        teams.add(team);
        return true;
    }

    public void printTeams(){
        //Collections
    }


}
