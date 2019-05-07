package com.viseo.formation;

import com.viseo.formation.config.RandomMediaPlayerConfig;
import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.util.MediaPlayerUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = RandomMediaPlayerConfig.class)
public class RunApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RandomMediaPlayerConfig.class);
        IMediaPlayer randomMediaPlayer = (IMediaPlayer) context.getBean("randomMediaPlayer");
        Integer randomIndex = MediaPlayerUtils.getRandomNumberInRange(0, randomMediaPlayer.getPlaylist().size()-1);
        System.out.println("The current song playing is:" + randomMediaPlayer.playMedia(randomIndex));
    }
}
