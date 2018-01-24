package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


import com.example.vova.diarchyofthewalls.R;

public class PauseActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pause);

        final Button settings = (Button) findViewById(R.id.settingBt);
        final Button Exit = (Button) findViewById(R.id.ExitBt);


        final Intent sett = new Intent(this, SettingsActivity.class);
        final Intent exi = new Intent(this, MainActivity.class);


        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sett);
            }
        });


        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(exi);
            }
        });
    }


}
