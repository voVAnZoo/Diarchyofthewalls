package com.example.vova.diarchyofthewalls.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.vova.diarchyofthewalls.R;
import com.example.vova.diarchyofthewalls.core.Entity;
import com.example.vova.diarchyofthewalls.core.GameWorld;
import com.example.vova.diarchyofthewalls.core.Player;

import java.lang.reflect.Array;

public class BattleActivity extends AppCompatActivity {

    public TextView[] Action = new TextView[6];

    int turn=0;

    int kn1 = 0;
    int kn4 = 0;
    int kn3 = 0;
    int kn2 = 0;
    int kn5 = 0;

    int i;

    boolean acid;
    boolean fire;

    boolean damup=false;
    boolean defdown=false;
    double defup=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        final GameWorld gw = (GameWorld) findViewById(R.id.gameWorld);
        final Player p = gw.p;
        final Entity e = gw.e;

        final ImageButton Damage = (ImageButton) findViewById(R.id.DamageBt);
        final ImageButton Defence = (ImageButton) findViewById(R.id.DefenceBt);
        final ImageButton DamageUp = (ImageButton) findViewById(R.id.DamageUpBt);
        final ImageButton Evasion = (ImageButton) findViewById(R.id.EvasionBt);
        final ImageButton DefDown = (ImageButton) findViewById(R.id.DefDownBt);

        Action[1] = (TextView) findViewById(R.id.Action1);
        Action[2] = (TextView) findViewById(R.id.Action2);
        Action[3] = (TextView) findViewById(R.id.Action3);
        Action[4] = (TextView) findViewById(R.id.Action4);
        Action[5] = (TextView) findViewById(R.id.Action5);
        Action[6] = (TextView) findViewById(R.id.Action6);

        final Intent EndGame = new Intent(this, MainActivity.class);

        while (p.hp > 0 && e.hp > 0) {
            ++turn;
            defup = 0;
            if (acid)
                p.hp = p.hp - 2;
            if (fire)
                p.hp = p.hp - 3;
            if (turn % 2 == kn1 % 2) {
                DamageUp.setEnabled(true);
                DamageUp.setImageResource(R.drawable.right);
            }
            if (turn % 2 == kn2 % 2) {
                Defence.setEnabled(true);
                Defence.setImageResource(R.drawable.right);
            }
            if (turn % 2 == kn5 % 2) {
                DefDown.setEnabled(true);
                DefDown.setImageResource(R.drawable.right);
            }
            if (turn % 2 == kn3 % 2){
                Damage.setEnabled(true);
                Damage.setImageResource(R.drawable.right);
            }
            if (turn % 2 == kn4 % 2) {
                Evasion.setEnabled(true);
                Evasion.setImageResource(R.drawable.right);
            }
            for (i = 0; i < 10; i++) {
                Action[i+1]=Action[i];
            }
            Action[6].setText("@string/Turn" + turn);
            DamageUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn1 = turn;
                    kn3 = turn+1;
                    kn5 = turn+1;
                    damup = true;
                    DamageUp.setEnabled(false);
                    DamageUp.setImageResource(R.drawable.left);
                    Damage.setEnabled(false);
                    Damage.setImageResource(R.drawable.left);
                    DefDown.setEnabled(false);
                    DefDown.setImageResource(R.drawable.left);
                    for (i = 0; i < 10; i++) {
                        Action[i+1]=Action[i];
                    }
                    Action[6].setText("@string/AttackAction1");
                }
            });
            Damage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn3 = turn;
                    kn1 = turn+1;
                    kn5 = turn+1;
                    if (damup)
                        e.hp = e.hp-p.damage*1.5;
                    else
                        e.hp = e.hp-p.damage;
                    Damage.setEnabled(false);
                    Damage.setImageResource(R.drawable.left);
                    DamageUp.setEnabled(false);
                    DamageUp.setImageResource(R.drawable.left);
                    DefDown.setEnabled(false);
                    DefDown.setImageResource(R.drawable.left);
                    for (i = 0; i < 10; i++) {
                        Action[i+1]=Action[i];
                    }
                    Action[6].setText("@string/AttackAction2");
                }
            });
            DefDown.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn3 = turn+1;
                    kn1 = turn+1;
                    kn5 = turn;
                    defdown=true;
                    Damage.setEnabled(false);
                    Damage.setImageResource(R.drawable.left);
                    DamageUp.setEnabled(false);
                    DamageUp.setImageResource(R.drawable.left);
                    DefDown.setEnabled(false);
                    DefDown.setImageResource(R.drawable.left);
                    for (i = 0; i < 10; i++) {
                        Action[i+1]=Action[i];
                    }
                    Action[6].setText("@string/AttackAction3");
                }
            });
            Defence.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn2 = turn;
                    kn4 = turn+1;
                    defup = 10;
                    Defence.setEnabled(false);
                    Defence.setImageResource(R.drawable.left);
                    Evasion.setEnabled(false);
                    Evasion.setImageResource(R.drawable.left);
                    for (i = 0; i < 10; i++) {
                        Action[i+1]=Action[i];
                    }
                    Action[6].setText("@string/DefenceAction1");
                }
            });
            Evasion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn4 = turn;
                    kn2 = turn+1;
                    damup = true;
                    Evasion.setEnabled(false);
                    Evasion.setImageResource(R.drawable.left);
                    for (i = 0; i < 10; i++) {
                        Action[i+1]=Action[i];
                    }
                    Action[6].setText("@string/DefenceAction1");
                }
            });
            if (turn % 3 == 1) {
                acid = true;
                for (i = 0; i < 10; i++) {
                    Action[i+1]=Action[i];
                }
                Action[6].setText("@string/EnemyAction1");
            }
            if (turn % 3 == 2) {
                fire = true;
                for (i = 0; i < 10; i++) {
                    Action[i+1]=Action[i];
                }
                Action[6].setText("@string/EnemyAction1");
            }
            if (turn % 3 == 0 && e.damage > defup / 2){
                    p.hp = p.hp - e.damage + defup / 2;
                for (i = 0; i < 10; i++) {
                    Action[i+1]=Action[i];
                }
                Action[6].setText("@string/EnemyAction1");
            }
        }
        if (p.hp <= 0)
            startActivity(EndGame);
        else
            e.life = true;
    }
}
