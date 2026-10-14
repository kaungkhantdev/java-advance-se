package com.astronity.designpattern.bridge;

public class Rectangle extends Shape {
    Rectangle(DrawingApi drawingApi) {
        super(drawingApi);
    }
    @Override
    public void draw() {
        this.api.drawCircle();
    }
}
