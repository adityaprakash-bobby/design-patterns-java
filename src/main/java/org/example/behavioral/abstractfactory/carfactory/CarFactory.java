package org.example.behavioral.abstractfactory.carfactory;

public class CarFactory {
    private CarFactory() {
    }

    public static Car buildCar(CarType model) {
        // determine location dynamically unlike below. Only for representation
        Location location = Location.INDIA;

        return switch (location) {
            case DEFAULT -> DefaultCarFactory.buildCar(model);
            case INDIA -> IndiaCarFactory.buildCar(model);
            case USA -> UsaCarFactory.buildCar(model);
        };
    }
}
