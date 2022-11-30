package com.oo101;

public class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, Engine engine){
        this.name = name;
        this.speed = engine.getSpeed();
    }

    public void speedUp(){

    }

}
