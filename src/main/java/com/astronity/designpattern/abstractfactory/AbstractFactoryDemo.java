package com.astronity.designpattern.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        UiFactory uiFactory = new AwtFactory();
        Button button = uiFactory.createButton();

        button.click();

        uiFactory = new SwingFactory();
        Button button2 = uiFactory.createButton();
        button2.click();
    }
}
