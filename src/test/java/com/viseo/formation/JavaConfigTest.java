package com.viseo.formation;

import com.viseo.formation.config.RandomMediaPlayerConfig;
import com.viseo.formation.sound.IMediaFile;
import com.viseo.formation.sound.IMediaPlayer;
import com.viseo.formation.util.MediaPlayerUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // Allowed to have a Spring application context created when test starts
@ContextConfiguration(classes = {RandomMediaPlayerConfig.class}) // Tells Spring to load the configuration
public class JavaConfigTest {

    @Test
    public void media_player_should_not_be_null(){

    }


    @Test
    public void media_player_playlist_should_not_be_empty(){

    }

    @Test
    public void media_file_in_playlist_should_be_consistent(){

        // Get a random media file

        // Check properties of randomly selected media file

    }

}
