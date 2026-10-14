package com.astronity.designpattern.bridge;

public class Circle extends Shape {
    Circle(DrawingApi drawingApi) {
        super(drawingApi);
    }

    @Override
    void draw() {
        this.api.drawCircle();
    }
}
