package com.timbuchalka.genericschallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends TeamSport> {
    private ArrayList<Team<T>> teams;

    public League() {
        teams = new ArrayList<>();
    }

    boolean addTeam(Team<T> team) {
        if (teams.contains(team)) {
            System.out.println("Team: " + team.getTeamName() + " already is in league.");
            return false;
        }
        teams.add(team);
        System.out.println("Team: " + team.getTeamName() + " added to league.");
        return true;
    }

    public void printTeams() {
        Collections.sort(teams);
        int place = 1;
        for (Team team: teams) {
            System.out.println(place + ": " + team.getTeamName() + " - " + team.getRanking());
            place++;
        }
    }


}
