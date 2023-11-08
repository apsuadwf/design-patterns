package org.ytmf.behavioral.command;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:11
 */
public class LightOnCommand implements Command {
    /**
     * 持有目标对象
     */
    private Light light;

    /**
     * 注入目标对象
     * @param light 目标对象
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 具体执行命令
     */
    @Override
    public void execute() {
        light.turnOn();
    }
}
