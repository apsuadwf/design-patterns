package org.ytmf.behavioral.command;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:18
 */
public class Client {
    public static void main(String[] args) {
        // 创建灯
        Light light = new Light();
        // 创建开灯命令
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand);
        remoteControl.pressButton();

        AppControl appControl = new AppControl(lightOnCommand);
        appControl.pressButton();

        System.out.println("------------------");

        // 创建宏命令
        MacroCommand macroCommand = new MacroCommand();

        // 添加命令
        macroCommand.addCommand(lightOnCommand);
        macroCommand.addCommand(lightOffCommand);

        // 传入控制器
        remoteControl.setCommand(macroCommand);

        // 执行宏命令
        remoteControl.pressButton();
    }
}
