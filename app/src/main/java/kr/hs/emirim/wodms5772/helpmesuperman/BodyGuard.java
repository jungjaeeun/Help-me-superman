package kr.hs.emirim.wodms5772.helpmesuperman;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by appcreate29 on 2016. 6. 16..
 */
public class BodyGuard extends AppCompatActivity {
    //@Override
    EditText edit;
    String position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safe);
    }

    public void submit(View v) {
        edit=(EditText)findViewById(R.id.edit_your);
        position=edit.getText().toString();

        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setMessage(position+"이 등록되었습니다!");
    }
}
