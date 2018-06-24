package com.viseo.formation.sound;

/**
 * Media files interface
 */
public interface IMediaFile {

    String play();

    String getTitle();

    String getArtist();

    String getAlbum();

    Integer getDuration();
}
