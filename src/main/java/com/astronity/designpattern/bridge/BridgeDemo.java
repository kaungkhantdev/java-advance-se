package com.astronity.designpattern.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        DrawingApi api  = new SvgApi();
        api = new CanvasApi();
        api.drawRectangle();
        api.drawCircle();
    }
}
