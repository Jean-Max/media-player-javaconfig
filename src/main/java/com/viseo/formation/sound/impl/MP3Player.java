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

    public MP3Player(List<IMediaFile> playlist){
        this.playlist = playlist;
    }

    @PostConstruct
    public void InitUserPlaylist(){
        this.playlist = new ArrayList<IMediaFile>();
        this.playlist.add(new SocaMP3File());
        this.playlist.add(new Soca2MP3File());
        this.playlist.add(new HipHopMP3File());
        this.playlist.add(new HipHop2MP3File());
        this.playlist.add(new PopMP3File());

        System.out.println("User Media Playlist has been initialized with " + this.playlist.size() + " audio files!");
    }

    public String playMedia() {
        final int index = getRandomNumberInRange(0, this.playlist.size() - 1);
        System.out.println("Audio file selected number: " + index);
        IMediaFile mediaFileSelected = this.playlist.get(index);
        return mediaFileSelected.play();
    }

    @PreDestroy
    public void DestroyUserPlaylist(){
        System.out.println("Before pre destroy hook, user playlist contains: " + this.playlist.size() + " media files");
        this.playlist.clear();
        System.out.println("After pre destroy hook, user playlist contains: " + this.playlist.size() + " media files");
    }

    public List<IMediaFile> getPlaylist() {
        return playlist;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

}
