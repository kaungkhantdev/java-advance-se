package com.astronity.designpattern.flyweight;

public class JVMPlatform implements Platform {
    public JVMPlatform() {
        System.out.println("JVM Platform Created");
    }

    @Override
    public void execute(Code code) {
        System.out.println("JVM Platform Executing: " + code);
    }
}
