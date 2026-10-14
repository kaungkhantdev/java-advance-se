package com.astronity.designpattern.bridge;

public class CanvasApi implements DrawingApi {
    @Override
    public void drawRectangle() {
        System.out.println("Drawing Canvas Rectangle");
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing Canvas Circle");
    }
}
