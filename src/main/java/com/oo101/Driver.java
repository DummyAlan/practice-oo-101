package com.oo101;

public class Driver {

    private final Vehicle vehicle;

    private Driver(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void speedUp(){
        this.vehicle.speedUp();
    }

    public static void main(String[] args){
        Car coolCar = new Car("Cool Car", 30);
        coolCar.speedUp();
        Truck bigTruck = new Truck("Big Truck", 10);
        bigTruck.speedUp();

        Driver driver1 = new Driver(new Car("Cool Car", 30));
        driver1.speedUp();
        Driver driver2 = new Driver(new Truck("Big Truck", 30));
        driver2.speedUp();

    }



}
