package com.viseo.formation.sound;


import java.util.List;

public interface IMediaPlayer {

    /**
     * Play the selected media file
     * @return
     */
    String playMedia();

    /**
     * Get the play list
     */
    List<IMediaFile> getPlaylist();

}
