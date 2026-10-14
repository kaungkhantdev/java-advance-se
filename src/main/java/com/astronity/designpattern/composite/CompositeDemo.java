package com.astronity.designpattern.composite;

import javax.swing.*;

public class CompositeDemo {
    public static void main(String[] args) {
        ViewGroup viewGroup = new ViewGroup("View Group 1");
        viewGroup.addChild(new View("View 1"));
        viewGroup.addChild(new View("View 2"));

        ViewGroup childViewGroup = new ViewGroup("Child View Group 1");
        childViewGroup.addChild(new View("Child View 1"));
        childViewGroup.addChild(new View("Child View 2"));

        viewGroup.addChild(childViewGroup);

        viewGroup.render();
    }
}
