package com.astronity.designpattern.state;

public class StateContext {
    State currentState;

    public StateContext(State initial) {
        this.currentState = initial;
    }

    void changeState(State newState) {
        this.currentState = newState;
    }

    void doAction() {
        this.currentState.doAction(this);
    }
}
