package com.viseo.formation;

import com.viseo.formation.config.RandomMediaPlayerConfig;
import com.viseo.formation.sound.IMediaPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = RandomMediaPlayerConfig.class)
public class RunApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RandomMediaPlayerConfig.class);
        IMediaPlayer randomMediaPlayer = (IMediaPlayer) context.getBean("randomMediaPlayer");
        System.out.println("The current song playing is:" + randomMediaPlayer.playMedia());

        // Close the context to force beans destruction
        context.close();
    }
}
