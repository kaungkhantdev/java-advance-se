package com.astronity.designpattern.state;

public class StateDemo {
    public static void main(String[] args) {
        StateContext stateContext = new StateContext(new HungryState());
        stateContext.doAction();
        stateContext.doAction();
        stateContext.doAction();

    }
}
