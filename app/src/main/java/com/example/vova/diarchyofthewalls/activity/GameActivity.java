package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

import com.example.vova.diarchyofthewalls.core.Entity;

import com.example.vova.diarchyofthewalls.R;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final Button Pause = (Button) findViewById(R.id.PauseBt);
        final ImageButton lef = (ImageButton) findViewById(R.id.LeftBt);
        final ImageButton rig = (ImageButton) findViewById(R.id.RightBt);
        final Button ite = (Button) findViewById(R.id.itemBt);
        final Button Eqi = (Button) findViewById(R.id.EqBt);
        final Button chal = (Button) findViewById(R.id.ChangeLvlBt);
        final Button chas = (Button) findViewById(R.id.ChangeBt);
        final Intent pau = new Intent(this, PauseActivity.class);
        final Intent item = new Intent(this, ItemActivity.class);
        chal.setEnabled(false);
        chas.setEnabled(false);

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
        lef.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent Event) {
                switch (Event.getAction()) {
                    case MotionEvent.ACTION_BUTTON_PRESS:

                    case MotionEvent.ACTION_UP:
                        break;
                }
                return false;
            }
        });
        rig.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent Event) {
                switch (Event.getAction()) {
                    case MotionEvent.ACTION_BUTTON_PRESS:
                    case MotionEvent.ACTION_UP:
                        break;
                }
                return false;
            }
        });
    }
}
