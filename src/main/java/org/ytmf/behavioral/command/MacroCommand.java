package org.ytmf.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 宏命令
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:28
 */
public class MacroCommand implements Command {

    /**
     * 命令组
     */
    private List<Command> commands;

    public MacroCommand() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
