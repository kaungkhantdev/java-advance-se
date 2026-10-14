package com.astronity.oop.dependencyinversion;

public class Car {

    // Dependency injection
    Engine engine;
    Car(Engine engine) {
        this.engine = engine;
    }

    public void start()
    {
        System.out.println("Car start");
        this.engine.start();
    }
}
