package com.astronity.oop.dependencyinversion;

public class GasEngine extends Engine {
    @Override
    public void start() {
        System.out.println("GasEngine start");
    }
}
