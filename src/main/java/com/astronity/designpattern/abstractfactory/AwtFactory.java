package com.astronity.designpattern.abstractfactory;

public class AwtFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new AwtButton();
    }
}
