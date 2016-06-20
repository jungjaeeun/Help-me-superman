package kr.hs.emirim.wodms5772.helpmesuperman;

import android.content.Intent;
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
        Uri playUri=Uri.parse("file:///호루라기트레인.mp3");
        Intent intent=new Intent(Intent.ACTION_VIEW,playUri);
    }
}

//appcreate29/AndroidStudioProjects/Helpmesuperman/app/src/main/