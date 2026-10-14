package com.astronity.oop.dependencyinversion;

public class OpenCloseDemo {
    public static void main(String[] args) {
        Engine engine = new DiselEngine();
        Car car = new Car(engine);
        car.start();

        engine = new GasEngine();
        car =  new Car(engine);
        car.start();
    }
}
