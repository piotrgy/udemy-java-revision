package com.timbuchalka.musicplayer;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    private Album(String title) {
        this.title = title;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public static Album buildAlbum (String title, String[] songsTitles, int[] sonngsDurations) {
        Album album = new Album(title);
        for (int i = 0; i < songsTitles.length; i++) {
            album.songs.add(new Song(songsTitles[i], sonngsDurations[i]));
        }
        return album;
    }
}
