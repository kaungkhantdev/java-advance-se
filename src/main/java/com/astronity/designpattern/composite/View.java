package com.astronity.designpattern.composite;

public class View extends UiWidget {
    public View(String id) {
        super(id);
    }

    @Override
    public void render() {
        System.out.println("Rendering View " + id);
    }
}
