package com.astronity.designpattern.bridge;

public abstract class Shape {
    DrawingApi api;
    Shape(DrawingApi api) {
        this.api = api;
    }

    abstract void draw();
}
