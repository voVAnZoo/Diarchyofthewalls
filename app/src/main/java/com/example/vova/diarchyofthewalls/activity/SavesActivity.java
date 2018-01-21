package com.example.vova.diarchyofthewalls.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.vova.diarchyofthewalls.R;

public class SavesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saves);

        final Button save1 = (Button) findViewById(R.id.save1);

        if(true) {
            save1.setText("sdad");
        }else {
            save1.setText("empty");
        }

    }
}
