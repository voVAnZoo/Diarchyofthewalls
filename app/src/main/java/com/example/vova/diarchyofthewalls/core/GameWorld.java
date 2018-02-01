package com.example.vova.diarchyofthewalls.core;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Vova on 20.01.2018.
 */

public class GameWorld extends View {

    public Player p = new Player();

    public GameWorld(Context context) {
        super(context);
    }

    public GameWorld(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GameWorld(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public GameWorld(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public static void init(){

    }

    @Override
    protected void onDraw (Canvas canvas){

    }


}
