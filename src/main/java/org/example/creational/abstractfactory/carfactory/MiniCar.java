package org.example.creational.abstractfactory.carfactory;

class MiniCar extends Car {

    MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to mini car");
    }
}
