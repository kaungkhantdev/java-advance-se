package com.astronity.designpattern.state;

import com.astronity.designpattern.chainofresponsibility.Response;

public interface State {
    public void doAction(StateContext state);
}
