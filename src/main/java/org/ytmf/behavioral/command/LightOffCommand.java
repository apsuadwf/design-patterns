package org.ytmf.behavioral.command;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:14
 */
public class LightOffCommand implements Command {

    /**
     * 持有目标对象
     */
    private Light light;

    /**
     * 注入目标对象
     * @param light 目标对象
     */
    public LightOffCommand(Light light) {
        this.light = light;
    }

    /**
     * 具体执行方法
     */
    @Override
    public void execute() {
        light.turnOff();
    }
}
