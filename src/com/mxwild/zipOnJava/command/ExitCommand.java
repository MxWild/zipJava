package com.mxwild.zipOnJava.command;

import com.mxwild.zipOnJava.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
