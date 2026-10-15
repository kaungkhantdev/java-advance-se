package com.astronity.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    Originator originator;
    CareTaker(Originator originator)
    {
        this.originator = originator;
    }

    List<Memento> history = new ArrayList<Memento>();

    void addHistory(Memento memento)
    {
        history.add(memento);
    }

    void undoHistory()
    {
        Memento memento = history.get(history.size()-1);
        this.history.remove(this.history.size()-1);
        this.originator.restore(memento);
    }
}
