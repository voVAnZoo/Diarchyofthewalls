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

public class BattleActivity extends AppCompatActivity {

    public  TextView AttackAction;
    public  TextView DefenceAction;
    public  TextView EnemyAction;
    public  TextView Turn;

    int turn=0;

    int kn1 = 0;
    int kn4 = 0;
    int kn3 = 0;
    int kn2 = 0;

    boolean acid;
    boolean fire;

    boolean damup=false;
    double defup=0;

    boolean flag1=true;
    boolean flag2=true;
    boolean flag3=true;
    boolean flag4=true;

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

        AttackAction = (TextView) findViewById(R.id.AttackAction);
        DefenceAction= (TextView) findViewById(R.id.DefenceAction);
        EnemyAction= (TextView) findViewById(R.id.EnemyAction);
        Turn = (TextView) findViewById(R.id.Turn);

        final Intent EndGame = new Intent(this, MainActivity.class);

        while (p.hp > 0 && e.hp > 0) {
            ++turn;
            defup=0;
            Turn.setText("@string/Turn" + turn);
            if (acid)
                p.hp=p.hp-2;
            if (fire)
                p.hp=p.hp-3;
            if (turn % 2 == kn1 % 2)
                DamageUp.setEnabled(true);
            if (turn % 2 == kn2 % 2)
                Defence.setEnabled(true);
            if (turn % 2 == kn3 % 2)
                Damage.setEnabled(true);
            if (turn % 2 == kn4 % 2)
                Evasion.setEnabled(true);
            DamageUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn1 = turn;
                    damup = true;
                    DamageUp.setEnabled(false);
                    if (flag1)
                        Damage.setImageResource(R.drawable.right);
                    else
                        Damage.setImageResource(R.drawable.left);
                    flag1 = !flag1;
                    AttackAction.setText("@string/AtackAction1");
                }
            });
            Damage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn3 = turn;
                    if (damup)
                        e.hp = e.hp;
                    Damage.setEnabled(false);
                    if (flag3)
                        Damage.setImageResource(R.drawable.right);
                    else
                        Damage.setImageResource(R.drawable.left);
                    flag3 = !flag3;
                    AttackAction.setText("@string/AtackAction2");
                }
            });
            Defence.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn2 = turn;
                    defup = 10;
                    Defence.setEnabled(false);
                    if (flag2)
                        Defence.setImageResource(R.drawable.right);
                    else
                        Defence.setImageResource(R.drawable.left);
                    flag2 = !flag2;
                    DefenceAction.setText("@string/DefenceAction1");
                }
            });
            Evasion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    kn4 = turn;
                    damup = true;
                    Evasion.setEnabled(false);
                    if (flag4)
                        Evasion.setImageResource(R.drawable.right);
                    else
                        Evasion.setImageResource(R.drawable.left);
                    flag4 = !flag4;
                    DefenceAction.setText("@string/DefenceAction1");
                }
            });
            if (turn % 3 == 1) {
                acid = true;

            }
            if (turn % 3 == 2) {
                fire = true;
            }
            if (turn % 3 == 0 && e.damage > defup / 2){
                    p.hp = p.hp - e.damage + defup / 2;
            }
        }
        if (p.hp <= 0)
            startActivity(EndGame);
        else
            e.life = true;
    }
}
