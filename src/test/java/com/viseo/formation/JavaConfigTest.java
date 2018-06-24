package com.viseo.formation;

import com.viseo.formation.config.MediaPlayerConfig;
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
    @Qualifier("randomMP3")
    private IMediaFile randomMediafile;

    @Autowired
    @Qualifier("randomMediaPlayer")
    private IMediaPlayer randomMediaPlayer;

    @Test
    public void media_file_should_not_be_null(){

        Assert.assertNotNull(randomMediafile);
        Assert.assertNotNull(randomMediafile.getTitle());
        Assert.assertNotNull(randomMediafile.getArtist());
        Assert.assertNotNull(randomMediafile.getAlbum());
        Assert.assertNotNull(randomMediafile.getDuration());

        System.out.println("Song title is:" + randomMediafile.getTitle());
        System.out.println("Album is:" + randomMediafile.getAlbum());
        System.out.println("Artist performing is:" + randomMediafile.getArtist());
        System.out.println("Song duration is:" + randomMediafile.getDuration());
    }

    @Test
    public void media_player_should_note_be_null(){

        Assert.assertNotNull(randomMediaPlayer);

        System.out.println(randomMediaPlayer.playMedia());
    }
}
