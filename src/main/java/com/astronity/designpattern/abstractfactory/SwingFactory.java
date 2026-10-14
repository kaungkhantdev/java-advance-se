package com.astronity.designpattern.abstractfactory;

public class SwingFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new SwingButton();
    }
}
