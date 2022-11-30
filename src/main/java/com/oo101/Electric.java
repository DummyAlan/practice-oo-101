package com.oo101;

public class Electric extends Engine{

    int speed;

    public Electric() {
        this.speed = 25;
    }

    @Override
    public int getSpeed(){
        return this.speed;
    }
}
