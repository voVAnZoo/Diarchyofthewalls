package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.vova.diarchyofthewalls.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton settings = (ImageButton) findViewById(R.id.settingBt);
        final ImageButton startG = (ImageButton) findViewById(R.id.startBt);
        final ImageButton connectG = (ImageButton) findViewById(R.id.connectBt);
        
        final Intent sett = new Intent(this, SettingsActivity.class);
        final Intent conn = new Intent(this, ConnectActivity.class);
        final Intent save = new Intent(this, SavesActivity.class);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sett);
            }
        });

        startG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(save);
            }
        });

        connectG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(conn);
            }
        });

    }
}
