package com.astronity.designpattern.abstractfactory;

public class SwingButton implements Button {
    @Override
    public void click() {
        System.out.println("SwingButton Clicked!");
    }
}
