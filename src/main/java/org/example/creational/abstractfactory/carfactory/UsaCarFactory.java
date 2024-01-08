package org.example.creational.abstractfactory.carfactory;

class UsaCarFactory {
    public static Car buildCar(CarType model) {
        return switch (model) {
            case LUXURY -> new LuxuryCar(Location.USA);
            case MICRO -> new MicroCar(Location.USA);
            case MINI -> new MiniCar(Location.USA);
        };
    }
}
