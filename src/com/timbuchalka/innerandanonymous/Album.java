package com.timbuchalka.innerandanonymous;

import java.util.ArrayList;

public class Album {
    private String title;
    private SongList songs;

    private Album(String title) {
        this.title = title;
        this.songs = new SongList();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs.listOfSongs;
    }

    public static Album buildAlbum (String title, String[] songsTitles, int[] sonngsDurations) {
        Album album = new Album(title);
        for (int i = 0; i < songsTitles.length; i++) {
            album.songs.getListOfSongs().add(new Song(songsTitles[i], sonngsDurations[i]));
        }
        return album;
    }

    public void displaySongs(){
        System.out.println("The songs of the album " + title + ":");
        for (int i = 0; i < songs.getListOfSongs().size() ; i++) {
            System.out.println(" " + (i + 1) + ": " + songs.getListOfSongs().get(i).getTitle() + " - " + songs.getListOfSongs().get(i).getDuration() + " min");
        }
    }

    private class SongList{
        private ArrayList<Song> listOfSongs = new ArrayList<>();

        public ArrayList<Song> getListOfSongs() {
            return listOfSongs;
        }

        public boolean addSong(Song song){
            if (findSong(song) >= 0) return false;
            listOfSongs.add(song);
            return true;
        }

        private int findSong(Song song){
            for (int i = 0; i <listOfSongs.size() ; i++) {
                String titleOnList = listOfSongs.get(i).getTitle();
                if (song.getTitle().equalsIgnoreCase(titleOnList)) return i;
            }
            return -1;
        }

    }
}
