package com.astronity.designpattern.flyweight;

public class FlyWeightDemo {
    public static void main(String[] args) {
        Code code = new Code("i = 0");
        PlatformFactory platformFactory = new PlatformFactory();
        Platform p = platformFactory.getPlatform("JVM");
        p.execute(code);

        p = platformFactory.getPlatform("Mono");
        p.execute(code);

        p = platformFactory.getPlatform("JVM");
        p.execute(code);

    }
}
