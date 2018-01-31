package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.ProgressBar;
import android.widget.Button;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.example.vova.diarchyofthewalls.core.Entity;

import com.example.vova.diarchyofthewalls.R;

public class BattleActivity extends AppCompatActivity implements OnTouchListener{
    float x;
    float y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();
        y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                break;
        }
        return true;
    }
}
