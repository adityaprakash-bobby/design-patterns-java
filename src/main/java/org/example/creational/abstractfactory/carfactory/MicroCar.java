package org.example.creational.abstractfactory.carfactory;

class MicroCar extends Car {
    MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to micro car");
    }
}
