package com.astronity.designpattern.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String command) {
        System.out.println("Command: " + command);
    }
}
