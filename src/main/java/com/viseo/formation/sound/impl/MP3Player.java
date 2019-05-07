package com.viseo.formation.sound.impl;


import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class MP3Player implements IMediaPlayer {

    private List<IMediaFile> playlist;

    public MP3Player(){}

    //TODO: Initialize the playlist with all MP3 files after Mediaplayer instanciation!!
    public void InitUserPlaylist(){
        System.out.println("User Media Playlist has been initialized with " + this.playlist.size() + " audio files!");
    }

    // TODO: Erase the playlist before application context deletion!
    public void DestroyUserPlaylist(){

    }

    // TODO: Play the selected MP3 file
    public void playMedia(Integer mediaFileIndex) {
        System.out.println("You have selected audio file number: " + mediaFileIndex);
    }

    public List<IMediaFile> getPlaylist() {
        return playlist;
    }

}
