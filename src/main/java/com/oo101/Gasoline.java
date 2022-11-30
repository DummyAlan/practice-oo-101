package com.oo101;

public class Gasoline extends Engine{

    int speed;

    public Gasoline() {
        this.speed = 30;
    }

    @Override
    public int getSpeed(){
        return this.speed;
    }
}
