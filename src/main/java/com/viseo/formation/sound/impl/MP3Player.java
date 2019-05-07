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

    @PostConstruct
    public void InitUserPlaylist(){
        this.playlist = new ArrayList<IMediaFile>();
        this.playlist.add(new SocaMP3File());
        this.playlist.add(new Soca2MP3File());
        this.playlist.add(new HipHopMP3File());
        this.playlist.add(new HipHop2MP3File());
        this.playlist.add(new PopMP3File());
        this.playlist.add(new RockMP3File());

        System.out.println("User Media Playlist has been initialized with " + this.playlist.size() + " audio files!");
    }

    @PreDestroy
    public void DestroyUserPlaylist(){
        System.out.println("Now the play list will be erased!!");
        this.playlist.clear();
    }

    public List<IMediaFile> getPlaylist() {
        return playlist;
    }

    public void playMedia(Integer mediaFileIndex) {
        System.out.println("You have selected audio file number: " + mediaFileIndex);
        this.playlist.get(mediaFileIndex).play();
    }

}
