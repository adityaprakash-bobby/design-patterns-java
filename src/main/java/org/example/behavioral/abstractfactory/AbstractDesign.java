package org.example.behavioral.abstractfactory;

import org.example.behavioral.abstractfactory.carfactory.CarFactory;
import org.example.behavioral.abstractfactory.carfactory.CarType;

public class AbstractDesign {
    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.MICRO));
        System.out.println(CarFactory.buildCar(CarType.MINI));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
