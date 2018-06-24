package com.viseo.formation.sound.impl;

import com.viseo.formation.sound.IMediaFile;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@Component ("California Love")
public class RockMP3File implements IMediaFile {

    private String title = "Ride";

    private String artist = "Twenty One Pilots";

    private String album = "Blurry Face";

    private Integer duration = 240;

    public String play(){
        System.out.println("Playing " + title + " of album " + album + " by " + artist);
        return this.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString()  {
        return ToStringBuilder.reflectionToString(this);
    }
}
