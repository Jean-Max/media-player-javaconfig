package com.viseo.formation.config;

import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.sound.MP3Player;
import com.viseo.formation.sound.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomMediaPlayerConfig {



    @Bean(name = "randomMP3")
    public IMediaFile randomMediaFile(){

        int choice = getRandomNumberInRange(0,5);
        System.out.println("Audio file selected number: " + choice);
        IMediaFile audioFile;

        switch(choice){

            case 0:
                audioFile = new Soca2MP3File();
                break;

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

            case 5:
                audioFile = new HipHop2MP3File();
                break;

            default:
                audioFile =new PopMP3File();
        }

        return audioFile;
    }

    @Bean (name = "randomMediaPlayer")
    public IMediaPlayer mediaPlayer(){
        return new MP3Player(randomMediaFile());
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
