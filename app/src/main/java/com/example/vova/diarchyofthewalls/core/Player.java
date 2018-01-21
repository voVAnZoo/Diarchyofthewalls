package com.example.vova.diarchyofthewalls.core;

import java.util.List;

/**
 * Created by Vova on 20.01.2018.
 */

public class Player extends Entity {

    int coins;
    int xp;
    int level;

    List<Item> inventory;
    List<Item> weapons;

    public Player(){

        super();
    }
}
