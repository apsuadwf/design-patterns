package org.ytmf.behavioral.state.tv;

/**
 * 抽象状态接口,将每一个修改状态的动作抽象成一个接口
 * 定义一个接口，用于封装与上下文的特定状态相关的行为。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 18:33
 */
public interface TVState {
    /**
     * 开机状态下
     */
    void turnOn();

    /**
     * 关机状态
     */
    void turnOff();

    /**
     * 调整音量
     * @param volume 音量值
     */
    void adjustVolume(int volume);
}
