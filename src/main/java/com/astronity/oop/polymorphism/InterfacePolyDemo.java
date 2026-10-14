package com.astronity.oop.polymorphism;

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flying");
    }
}

class Aeroplane implements Flyable {
    public void fly() {
        System.out.println("Aeroplane flying");
    }
}

public class InterfacePolyDemo {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();

        flyable = new Aeroplane();
        flyable.fly();
    }
}
