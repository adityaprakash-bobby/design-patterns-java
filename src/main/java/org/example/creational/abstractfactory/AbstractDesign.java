package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.carfactory.CarFactory;
import org.example.creational.abstractfactory.carfactory.CarType;

public class AbstractDesign {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
