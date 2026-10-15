package com.astronity.designpattern.memento;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);

        originator.changeState("Hello");
        Memento m1 = originator.save();
        careTaker.addHistory(m1);

        originator.changeState("World");
        Memento m2 = originator.save();
        careTaker.addHistory(m2);

        originator.changeState("Nothing");

        careTaker.undoHistory();
        careTaker.undoHistory();
        System.out.println(originator.state);
    }
}
