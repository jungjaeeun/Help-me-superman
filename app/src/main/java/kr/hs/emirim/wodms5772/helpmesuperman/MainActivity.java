package kr.hs.emirim.wodms5772.helpmesuperman;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call, bodyguard, help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        call = (Button) findViewById(R.id.call);
        bodyguard = (Button) findViewById(R.id.bodyguard);
        help = (Button) findViewById(R.id.help);
    }

    public void call_me(View v) {
        Intent intent = new Intent(MainActivity.this, CallMe.class);
        startActivity(intent);
    }

    public void bodyguard(View v) {
        Intent intent = new Intent(MainActivity.this, BodyGuard.class);
        startActivity(intent);
    }

    public void help(View v) {
        Intent intent = new Intent(MainActivity.this, Help.class);
        startActivity(intent);
    }
}
