package com.astronity.designpattern.command;

public class CopyCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Copy command executed");
    }
}
