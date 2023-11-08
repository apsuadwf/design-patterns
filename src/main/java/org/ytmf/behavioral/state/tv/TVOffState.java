package org.ytmf.behavioral.state.tv;

/**
 * 在关机的状态下执行以下的操作
 * 实现抽象状态接口，为具体状态定义行为。每个具体状态类对应一个状态。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 18:39
 */
public class TVOffState implements TVState {
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is already off.");
    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("Cannot adjust volume, TV is off.");
    }
}
