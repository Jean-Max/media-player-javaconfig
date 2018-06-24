package com.viseo.formation;

import com.viseo.formation.config.MediaPlayerConfig;
import com.viseo.formation.config.RandomMediaPlayerConfig;
import com.viseo.formation.sound.impl.HipHopMP3File;
import com.viseo.formation.sound.IMediaFile;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = MediaPlayerConfig.class)
public class RunApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MediaPlayerConfig.class, RandomMediaPlayerConfig.class);

        HipHopMP3File hipHopMP3File = context.getBean(HipHopMP3File.class);
        IMediaFile randomMediaFile = context.getBean(IMediaFile.class);



    }
}
