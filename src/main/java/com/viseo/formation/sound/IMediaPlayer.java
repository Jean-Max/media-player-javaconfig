package com.viseo.formation.sound;


import java.util.List;

public interface IMediaPlayer {

    /**
     * Get the play list
     */
    List<IMediaFile> getPlaylist();

    /**
     * Play the selected media file
     */
    void playMedia(final Integer mediaFileIndex);
}
