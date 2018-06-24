package com.viseo.formation.config;

import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.sound.MP3Player;
import com.viseo.formation.sound.impl.HipHopMP3File;
import com.viseo.formation.sound.impl.PopMP3File;
import com.viseo.formation.sound.impl.RockMP3File;
import com.viseo.formation.sound.impl.SocaMP3File;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomMediaPlayerConfig {

    @Bean(name = "randomMP3")
    public IMediaFile randomMediaFile(){

        int choice = (int)Math.floor(Math.random()*4);
        IMediaFile audioFile = null;
        switch(choice){
            case 1:
                audioFile = new HipHopMP3File();
                break;
            case 2 :
                audioFile = new SocaMP3File();
                break;
            case 3:
                audioFile = new PopMP3File();
                break;
            case 4:
                audioFile = new RockMP3File();
                break;
        }

        return audioFile;
    }

    @Bean (name = "randomMediaPlayer")
    public IMediaPlayer mediaPlayer(){
        return new MP3Player(randomMediaFile());
    }
}
