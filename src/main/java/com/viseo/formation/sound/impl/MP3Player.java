package com.viseo.formation.sound.impl;


import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;

import java.util.List;

public class MP3Player implements IMediaPlayer {

    private List<IMediaFile> playlist;

    public MP3Player(){}

    public MP3Player(List<IMediaFile> playlist){
        this.playlist = playlist;
    }
    
    public void InitUserPlaylist(){

        System.out.println("User Media Playlist has been initialized with " + this.playlist.size() + " audio files!");
    }


    public void DestroyUserPlaylist(){
        System.out.println("Before pre destroy hook, user playlist contains: " + this.playlist.size() + " media files");
        // Clear list here
        System.out.println("After pre destroy hook, user playlist contains: " + this.playlist.size() + " media files");
    }

    /**
     * Play a mp3 file randomly
     * @return
     */
    public String playMedia() {

        // Get an MP3 randomly from the from the playlist
        final int index = 1; // Default value
        IMediaFile mediaFileSelected = this.playlist.get(index);
        return mediaFileSelected.play();
    }

    public List<IMediaFile> getPlaylist() {
        return playlist;
    }

    /**
     * Static method to get a random number
     * @param min
     * @param max
     * @return
     */
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

}
