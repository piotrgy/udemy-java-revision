package com.timbuchalka.musicplayer;

import java.util.LinkedList;

//section 9, lecture 67 - LinkedList Challenge Part 1

public class MusicPlayer {
    private LinkedList<Song> playlist = new LinkedList<>();
    private MusicLibrary musicLibrary = new MusicLibrary();

    public static void main(String[] args) {

        final String[] badAlbum = {"Bad", "The Way You Make Me Feel", "Speed Demon", "Liberian Girl", "Dirty Diana"};
        final int[] badAlbumDuration = {4, 2, 6, 3, 5};


        final String[] thrillerAlbum = {"Baby Be Mine", "Thriller", "Beat It", "Billie Jean", "Human Nature", "The Lady in My Life"};
        final int[] thrillerAlbumDuration = {5, 4, 3, 3, 6, 2};


        final String[] invincibleAlbum = {"Unbreakable", "Heartbreaker", "Invincible", "Heaven Can Wait", "You Rock My World", "Butterflies", "Speechless"};
        final int[] invincibleAlbumDuration = {6, 4, 2, 3, 4, 5, 5};

        MusicPlayer musicPlayer = new MusicPlayer();

        Album bad = Album.buildAlbum("Bad", badAlbum, badAlbumDuration);
        musicPlayer.musicLibrary.getAlbums().add(bad);

        Album thriller = Album.buildAlbum("Thriller", thrillerAlbum, thrillerAlbumDuration);
        musicPlayer.musicLibrary.getAlbums().add(thriller);

        Album invincible = Album.buildAlbum("Invincible", invincibleAlbum, invincibleAlbumDuration);
        musicPlayer.musicLibrary.getAlbums().add(invincible);

        musicPlayer.showMenu();

    }


    private void showMenu(){
        System.out.println("Choose action:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - go to previous song\n" +
                "3 - replay current song\n" +
                "4 - display the playlist\n" +
                "5 - remove current song from the playlist  \n" +
                "6 - print menu options");
    }
}
