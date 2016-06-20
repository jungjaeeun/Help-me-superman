package kr.hs.emirim.wodms5772.helpmesuperman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.net.URI;

/**
 * Created by appcreate29 on 2016. 6. 16..
 */
public class Help extends MainActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_me);
    }

    public void sound(View v) {
        MediaPlayer mp = MediaPlayer.create(Help.this, R.raw.song);
        mp.start();
    }

    public void sound_1(View v) {
        MediaPlayer mp = MediaPlayer.create(Help.this, R.raw.song);
        mp.pause();
    }


}

//appcreate29/AndroidStudioProjects/Helpmesuperman/app/src/main/