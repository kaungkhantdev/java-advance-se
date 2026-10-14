package com.astronity.designpattern.abstractfactory;

public class AwtButton implements Button {
    @Override
    public void click() {
        System.out.println("AwtButton Clicked!");
    }
}
