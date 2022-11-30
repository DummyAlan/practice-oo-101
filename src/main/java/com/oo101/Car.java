package com.oo101;

public class Car extends Vehicle{


    public Car(String name, Engine engine) {
        super(name, engine);
    }
    public Car(String name, int speed) {
        super(name, speed);
    }


    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println(this.name + ": speed up "+this.speed+" km/h");
    }
}
