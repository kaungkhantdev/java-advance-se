package com.astronity.designpattern.observer;

public class View implements Subscriber {
    String name;
    View(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("View "+this.name+" update "+message);
    }
}
