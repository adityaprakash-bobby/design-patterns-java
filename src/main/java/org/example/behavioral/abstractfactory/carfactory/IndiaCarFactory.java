package org.example.behavioral.abstractfactory.carfactory;

class IndiaCarFactory {
    public static Car buildCar(CarType model) {
        return switch (model) {
            case LUXURY -> new LuxuryCar(Location.INDIA);
            case MICRO -> new MicroCar(Location.INDIA);
            case MINI -> new MiniCar(Location.INDIA);
        };
    }
}
