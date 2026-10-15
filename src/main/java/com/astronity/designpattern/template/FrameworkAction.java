package com.astronity.designpattern.template;

public abstract class FrameworkAction {
    public void process()
    {
        this.authenticate();
        this.businessLogic();
        this.log();
    }

    void authenticate() {
        System.out.println("Authenticating");
    }

    abstract void businessLogic();

    void log() {
        System.out.println("Log Action");
    }
}
