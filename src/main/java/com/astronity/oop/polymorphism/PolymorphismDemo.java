package com.astronity.oop.polymorphism;

abstract class Shape { // same taxonomy use abstract
    abstract void draw();

    public void initPen()
    {
        System.out.println("Pen init");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}
