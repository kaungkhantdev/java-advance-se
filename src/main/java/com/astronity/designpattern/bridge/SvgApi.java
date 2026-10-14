package com.astronity.designpattern.bridge;

public class SvgApi implements DrawingApi {
    @Override
    public void drawRectangle() {
        System.out.println("Drawing SVG Rectangle");
    }

    @Override
    public void drawCircle() {
        System.out.println("Drawing SVG Circle");
    }
}
