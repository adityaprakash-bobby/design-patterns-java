package org.example.creational.abstractfactory.carfactory;

class DefaultCarFactory {
    public static Car buildCar(CarType model) {
        return switch (model) {
            case LUXURY -> new LuxuryCar(Location.DEFAULT);
            case MICRO -> new MicroCar(Location.DEFAULT);
            case MINI -> new MiniCar(Location.DEFAULT);
        };
    }
}
