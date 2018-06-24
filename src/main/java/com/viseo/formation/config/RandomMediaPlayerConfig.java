package com.viseo.formation.config;

import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.sound.impl.MP3Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RandomMediaPlayerConfig {

    @Bean (name = "randomMediaPlayer")
    public IMediaPlayer mediaPlayer(){
        MP3Player mp3Player = new MP3Player();
        List<IMediaFile> mp3Playlist = mp3Player.getPlaylist();
        return new MP3Player(mp3Playlist);
    }

}
