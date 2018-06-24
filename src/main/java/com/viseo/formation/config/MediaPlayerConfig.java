package com.viseo.formation.config;

import com.viseo.formation.sound.*;
import com.viseo.formation.sound.impl.HipHopMP3File;
import com.viseo.formation.sound.impl.PopMP3File;
import com.viseo.formation.sound.impl.RockMP3File;
import com.viseo.formation.sound.impl.SocaMP3File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MediaPlayerConfig {

    @Bean(name = "hiphop")
    public HipHopMP3File mediaFile(){
        return new HipHopMP3File();
    }

    @Bean(name = "soca")
    public SocaMP3File socaMP3File(){
        return new SocaMP3File();
    }

    @Bean(name = "pop")
    public PopMP3File popMP3File(){
        return new PopMP3File();
    }

    @Bean(name = "rock")
    public RockMP3File rockMP3File(){
        return new RockMP3File();
    }

    @Bean (name = "Media Player")
    public MP3Player mp3Player(){
        return new MP3Player(mediaFile());
    }

    // Declaring the Media Player referring the other bean is generally the best choice because
    // It does not depend on the the mp3File bean being declared in the same configuration
    @Bean(name = "Media player with parameter")
    public IMediaPlayer mediaPlayerWithParam(HipHopMP3File mediaFile){
        return new MP3Player(mediaFile);
    }

    // Another way to declare MP3Player bean
    @Bean(name = "Media Player with setter")
    public IMediaPlayer mediaPlayerWithSetter(RockMP3File mediaFile){
        MP3Player mp3Player = new MP3Player();
        mp3Player.setMediaFile(mediaFile);
        return new MP3Player(mediaFile);
    }

}
