package com.astronity.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        commands.add(command);
    }

    void removeCommand(Command command) {
        commands.remove(command);
    }

    void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
