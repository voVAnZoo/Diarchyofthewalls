package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.vova.diarchyofthewalls.R;
import com.example.vova.diarchyofthewalls.core.Entity;
import com.example.vova.diarchyofthewalls.core.GameWorld;
import com.example.vova.diarchyofthewalls.core.Player;

public class BattleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        final GameWorld gw =(GameWorld)  findViewById(R.id.gameWorld);
        final Player p =gw.p;
        final Entity e =gw.e;
        final Intent en = new Intent(this, MainActivity.class);
        View rootView = findViewById(android.R.id.content);
        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                float x = -1;
                float y = -1;

                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        x = event.getX();
                        y = event.getY();


                        break;
                    case MotionEvent.ACTION_MOVE:
                        break;
                    case MotionEvent.ACTION_UP:
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        break;

                }
                return true;
            }
        });
    if (p.hp<=0)
        startActivity(en);
    else
        e.life=true;
    }
}
