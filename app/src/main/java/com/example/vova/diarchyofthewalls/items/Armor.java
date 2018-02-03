package com.example.vova.diarchyofthewalls.items;

import com.example.vova.diarchyofthewalls.core.Item;

/**
 * Created by Vova on 20.01.2018.
 */

public class Armor extends Item {

    public  int  type;
    public  double defence;
    public  int durabilyti;

    public Armor(int type,double defence,int durabilyti){
        super();
        this.type=type;
        this.defence=defence;
        this.durabilyti=durabilyti;
    }
}
