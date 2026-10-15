package com.astronity.designpattern.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Model model = new Model();
        View v1 = new View("View1");
        model.attach(v1);

        View v2 = new View("View2");
        model.attach(v2);

        View v3 = new View("View3");
        model.attach(v3);

        model.change("Hello World");

        model.detach(v1);

        model.change("Another Hello World");
    }
}
