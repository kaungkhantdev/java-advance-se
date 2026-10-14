package com.astronity.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ViewGroup extends UiWidget{

    List<UiWidget> children = new ArrayList<>();

    public ViewGroup(String id) {
        super(id);
    }

    void addChild(UiWidget child) {
        children.add(child);
    }

    @Override
    public void render() {
        System.out.println("Rendering View Group " + id);
        for (UiWidget child : children) {
            child.render();
        }
    }
}
