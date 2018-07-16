package com.timbuchalka.genericschallenge;

public class App {
    public static void main(String[] args) {
        Football football = new Football("football!");
        Basketball basketball = new Basketball("basketball!");
        Polo polo = new Polo("polo!");

        Team<Football> arka = new Team<>("Arka Gdynia", football, 78);
        Team<Football> kaszubia = new Team<>("Kaszubia Kościerzyna", football, 28);
        Team<Football> lechia = new Team<>("Lechia Gdańsk", football, 42);
        //Team<Football> chemik = new Team<>("Chemik Police", basketball, 46);

        Team<Basketball> celtics = new Team<>("Boston Celtics", basketball, 67);
        Team<Basketball> lakers = new Team<>("Los Angeles Lakers", basketball, 98);
        Team<Basketball> knicks = new Team<>("New York Knicks", basketball, 75);

        Team<Polo> gimpers = new Team<>("Gimpers Lipusz", polo, 36);
        Team<Polo> clusters = new Team<>("Clusters Nakla", polo, 24);
        Team<Polo> boosters = new Team<>("Boosters Płocice", polo, 50);

        League<Football> footballLeague = new League<>();
        League<Basketball> basketballLeague = new League<>();
        League<Polo> poloLeague = new League<>();

        //footballLeague.addTeam(gimpers);
        footballLeague.addTeam(arka);
        footballLeague.addTeam(lechia);
        footballLeague.addTeam(kaszubia);
        footballLeague.addTeam(kaszubia);
        footballLeague.printTeams();

        //basketballLeague.addTeam(lechia);
        basketballLeague.addTeam(lakers);
        basketballLeague.addTeam(celtics);
        basketballLeague.addTeam(knicks);
        basketballLeague.addTeam(lakers);
        basketballLeague.printTeams();

        //poloLeague.addTeam(celtics);
        poloLeague.addTeam(gimpers);
        poloLeague.addTeam(clusters);
        poloLeague.addTeam(boosters);
        poloLeague.addTeam(gimpers);
        poloLeague.printTeams();
    }
}
