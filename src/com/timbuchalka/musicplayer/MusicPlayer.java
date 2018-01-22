package com.timbuchalka.musicplayer;

import java.util.LinkedList;

//section 9, lecture 67 - LinkedList Challenge Part 1

public class MusicPlayer {
    private LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {

        final String[] badAlbum = {"Bad", "The Way You Make Me Feel", "Speed Demon", "Liberian Girl", "Dirty Diana"};
        final int[] badAlbumDuration = {4, 2, 6, 3, 5};


        final String[] thrillerAlbum = {"Baby Be Mine", "Thriller", "Beat It", "Billie Jean", "Human Nature", "The Lady in My Life"};
        final int[] thrillerAlbumDuration = {5, 4, 3, 3, 6, 2};


        final String[] invincibleAlbum = {"Unbreakable", "Heartbreaker", "Invincible", "Heaven Can Wait", "You Rock My World", "Butterflies", "Speechless"};
        final int[] invincibleAlbumDuration = {6, 4, 2, 3, 4, 5, 5};

    }
}
