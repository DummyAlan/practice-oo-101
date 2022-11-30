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
        Car coolCar = new Car("Cool Car", new Gasoline());
        coolCar.speedUp();
        Truck bigTruck = new Truck("Big Truck", new Electric());
        bigTruck.speedUp();

        Driver driver1 = new Driver(new Car("Cool Car", new Gasoline()));
        driver1.speedUp();
        Driver driver2 = new Driver(new Truck("Big Truck", new Gasoline()));
        driver2.speedUp();
        Driver driver3 = new Driver(new Car("Cool Car", 12));
        driver3.speedUp();
    }



}
