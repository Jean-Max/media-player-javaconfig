package com.viseo.formation.sound.impl;

import com.viseo.formation.sound.IMediaFile;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@Component ("California Love")
public class SocaMP3File implements IMediaFile {

    private String title = "Mr. Fete";

    private String artist = "Machel Montano";

    private String album = "Double M";

    private Integer duration = 263;

    public String play(){
        System.out.println("Playing " + title + " of album " + album + " by " + artist);
        return this.toString();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getDuration() {
        return duration;
    }


    @Override
    public String toString()  {
        return ToStringBuilder.reflectionToString(this);
    }
}
