package com.astronity.designpattern.command;

public class EditCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Edit command executed");
    }
}
