package com.viseo.formation.config;

import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.sound.impl.MP3Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomMediaPlayerConfig {

    @Bean (name = "randomMediaPlayer")
    public IMediaPlayer mediaPlayer(){
        return new MP3Player();
    }

}
