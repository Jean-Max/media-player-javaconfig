package com.viseo.formation.sound;


import java.util.List;

public interface IMediaPlayer {

    /**
     * Get the play list
     */
    List<IMediaFile> getPlaylist();

    /**
     * Play the selected media file
     * @return
     */
    void playMedia(final Integer mediaFileIndex);
}
