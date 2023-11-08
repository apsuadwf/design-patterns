package org.ytmf.behavioral.state.tv;

/**
 * 在开机状态下，去执行以下各种操作
 * 实现抽象状态接口，为具体状态定义行为。每个具体状态类对应一个状态。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 18:37
 */
public class TVOnState implements TVState {
    @Override
    public void turnOn() {
        System.out.println("TV is already on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV.");
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Adjusting volume to: " + volume);
    }
}
