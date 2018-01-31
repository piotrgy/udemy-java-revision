package com.timbuchalka.musicplayer;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

        for (int i = 0; i < musicPlayer.musicLibrary.getAlbums().size() ; i++) {
            for (int j = 0; j < musicPlayer.musicLibrary.getAlbums().get(i).getSongs().size(); j++) {
                musicPlayer.playlist.add(musicPlayer.musicLibrary.getAlbums().get(i).getSongs().get(j));
            }
        }

        musicPlayer.showMenu();
        musicPlayer.useThePlayer();


    }

    private void useThePlayer() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Turning off the player.");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                            listIterator.next();
                        } else System.out.println("The track is no longer available.");
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getTitle());
                            listIterator.previous();
                        } else System.out.println("The track is no longer available.");
                    }
                    break;

                case 4:
                    ListIterator<Song> displayListIterator = playlist.listIterator();
                    int counter = 1;
                    System.out.println("The songs on the playlist:");
                    while (displayListIterator.hasNext()) {
                        Song song = displayListIterator.next();
                        System.out.println(" " + counter + ": " + song.getTitle() + " - " + song.getDuration() + " min");
                        counter++;
                    }
                    break;

                case 5:
                    listIterator.remove();
                    System.out.println("You removed the last playing song");
                    break;

                case 6:
                    showMenu();
                    break;
            }
        }
    }


    private void showMenu() {
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
