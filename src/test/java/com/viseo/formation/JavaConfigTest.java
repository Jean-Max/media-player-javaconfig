package com.viseo.formation;

import com.viseo.formation.config.RandomMediaPlayerConfig;
import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // Allowed to have a Spring application context created when test starts
@ContextConfiguration(classes = {RandomMediaPlayerConfig.class}) // Tells Spring to load the configuration
public class JavaConfigTest {


    @Autowired
    @Qualifier("randomMediaPlayer")
    private IMediaPlayer randomMediaPlayer;

    @Test
    public void media_player_should_play_media_randomly(){
        Assert.assertNotNull(randomMediaPlayer);
        String playedFile1 = randomMediaPlayer.playMedia();
        String playedFile2 = randomMediaPlayer.playMedia();
        System.out.println(playedFile1);
        System.out.println(playedFile2);

        Assert.assertNotEquals(playedFile1.toString(), playedFile2.toString());
    }
}
