package com.oo101;

public class Truck extends Vehicle{


    public Truck(String name, Engine engine) {
        super(name, engine);
    }

    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println(this.name + ": speed up "+this.speed+" km/h");
    }
}
