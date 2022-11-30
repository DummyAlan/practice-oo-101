package com.oo101;

public class Driver {


    public static void main(String[] args){
        Car coolCar = new Car("Cool Car", 30);
        coolCar.speedUp();
        Truck bigTruck = new Truck("Big Truck", 10);
        bigTruck.speedUp();

    }



}
