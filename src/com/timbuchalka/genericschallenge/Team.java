package com.timbuchalka.genericschallenge;

public class Team<T extends TeamSport>  implements Comparable<Team<T>> {

    private String teamName;
    private T sport;
    private int ranking;

    public Team(String teamName, T sport, int ranking) {
        this.teamName = teamName;
        this.sport = sport;
        this.ranking = ranking;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getRanking() {
        return ranking;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking > team.getRanking()){return -1;}
        if (this.ranking < team.getRanking()){return 1;}
        return 0;
    }
}
