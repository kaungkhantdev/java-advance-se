package com.astronity.designpattern.composite;

public abstract class UiWidget {
    String id;
    public UiWidget(String id) {
        this.id = id;
    }
    abstract public void render();
}
