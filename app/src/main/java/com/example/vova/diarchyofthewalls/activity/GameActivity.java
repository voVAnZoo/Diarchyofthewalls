package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vova.diarchyofthewalls.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Button Pause = (Button) findViewById(R.id.PauseBt);
        final Button lef = (Button) findViewById(R.id.LeftBt);
        final Button rig = (Button) findViewById(R.id.RightBt);
        final Button ite = (Button) findViewById(R.id.itemBt);
        final Button Eqi = (Button) findViewById(R.id.EqBt);
        final Intent pau = new Intent(this, PauseActivity.class);
        final Intent item = new Intent(this, ItemActivity.class);


        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(pau);
            }
        });
        ite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(item);
            }
        });
    }
}
