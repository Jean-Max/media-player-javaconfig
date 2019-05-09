package com.viseo.formation.sound;

/**
 * Media files interface
 */
public interface IMediaFile {

    /**
     * Play the media file
     */
    String play();

    /**
     * Get the song title
     * @return
     */
    String getTitle();

    /**
     * Get the artist performing the song
     */
    String getArtist();

    /**
     * Get the album related to this song.
     */
    String getAlbum();

    /**
     * Get the song duration
     */
    Integer getDuration();
}
