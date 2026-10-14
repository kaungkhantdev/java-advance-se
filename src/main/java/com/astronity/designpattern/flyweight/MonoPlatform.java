package com.astronity.designpattern.flyweight;

public class MonoPlatform implements Platform {
    MonoPlatform() {
        System.out.println("Mono Platform Created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("MonoPlatform Executing: " + code);
    }
}
