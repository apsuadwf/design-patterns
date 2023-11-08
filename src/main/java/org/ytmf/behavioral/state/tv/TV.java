package org.ytmf.behavioral.state.tv;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文类
 * 上下文通常包含一个具体状态的引用，用于维护当前状态。
 * 上下文委托给当前状态对象处理状态相关行为。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 18:41
 */
public class TV {
    /**
     * 当前状态
     */
    private TVState state;
    /**
     * 状态有限，进行缓存
     */
    private final Map<TVStateType, TVState> stateCache = new HashMap<>();

    public TV() {
        stateCache.put(TVStateType.ON,new TVOnState());
        stateCache.put(TVStateType.OFF,new TVOffState());
        this.state = stateCache.get(TVStateType.OFF);
    }

    /**
     * 电视状态设置
     * 私有化防止外部改变状态
     *
     * @param state 电视具体状态
     */
    private void setState(TVState state) {
        this.state = state;
    }

    public void turnOn(){
        // 打开电视
        state.turnOn();

        // 设置为开机状态
        setState(stateCache.get(TVStateType.ON));
    }

    public void turnOff(){
        // 关闭电视
        state.turnOff();

        // 设置为关机状态
        setState(stateCache.get(TVStateType.OFF));
    }

    public void adjustVolume(int volume) {
        state.adjustVolume(volume);
    }

    private enum TVStateType{
        /**
         * 开机状态
         */
        ON,
        /**
         * 关机状态
         */
        OFF
    }
}
