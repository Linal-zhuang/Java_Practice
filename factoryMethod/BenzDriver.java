package com.example.factoryMethod;

/**
 * Created by ZLX on 2018/3/26.
 */

public class BenzDriver implements IDriver {
    @Override
    public Car driverCar() {
        return new Benz();
    }
}
