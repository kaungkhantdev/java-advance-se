package com.astronity.designpattern.proxy;

public class AccessProxy implements CommandExecutor {
    boolean isAdmin = false;
    CommandExecutor commandExecutor = new CommandExecutorImpl();

    AccessProxy(String username, String password) {
        if(username.equals("admin")&& password.equals("admin"))
        {
            this.isAdmin = true;
        }
    }

    @Override
    public void runCommand(String command) {
        if (isAdmin) {
            commandExecutor.runCommand(command);
        } else {
            if (command.startsWith("rm")) {
                throw new RuntimeException("Invalid access right");
            } else {
                this.commandExecutor.runCommand(command);
            }
        }
    }
}
