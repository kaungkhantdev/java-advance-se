package com.astronity.designpattern.state;

class EatingState implements State {
    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("I am eating");
        stateContext.changeState(new FullState());
    }
}

class FullState implements State {
    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("I am full");
    }
}

public class HungryState implements State {
    @Override
    public void doAction(StateContext stateContext) {
        System.out.println("I am hungry");
        stateContext.changeState(new EatingState());
    }
}


