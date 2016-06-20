package kr.hs.emirim.wodms5772.helpmesuperman;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by appcreate29 on 2016. 6. 16..
 */
public class CallMe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_me);
    }

    public void father_1(View v) {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
        startActivity(intent);
    }

    public void father_2(View v) {
        Intent intent = new Intent(CallMe.this, Calling.class);
        startActivity(intent);
    }

}
