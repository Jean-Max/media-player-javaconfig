package com.viseo.formation.sound;


public class MP3Player implements IMediaPlayer {

    private IMediaFile mediaFile;

    public MP3Player(){}

    public MP3Player(IMediaFile mediaFile){
        this.mediaFile = mediaFile;
    }

    public void setMediaFile(IMediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    public String playMedia() {
       return mediaFile.play();
    }
}
