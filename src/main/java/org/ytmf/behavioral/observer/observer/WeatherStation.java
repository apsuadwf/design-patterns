package org.ytmf.behavioral.observer.observer;

import java.util.ArrayList;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:44
 */
public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 大气压
     */
    private float pressure;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    /**
     * 注册观察左
     *
     * @param o 观察者对象
     */
    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o 观察者对象
     */
    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        // 循环所有的观察者，通知其当前的气象信息
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }

    }

    /**
     * 修改气象内容
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 当测量值发生了变化的时候
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 大气压
     */
    public void setMeasurements(float temperature, float humidity, float
            pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 测量值发生了变化
        measurementsChanged();
    }
}
