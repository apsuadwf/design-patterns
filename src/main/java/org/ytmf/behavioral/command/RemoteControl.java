package org.ytmf.behavioral.command;

/**
 * 请求者
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:16
 */
public class RemoteControl {

    private Command command;

    public RemoteControl() {
    }

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
