package org.ytmf.behavioral.observer.pubsub.async;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 事件总线单例类，用于发布-订阅模式中事件的订阅和发布。
 * 实现了序列化接口以防止序列化和反序列化时创建新的实例。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 18:07
 */
public class EventBus implements Serializable {

    private volatile static EventBus instance;
    private List<Subscriber> subscribers;
    private ExecutorService executorService;


    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    /**
     * 私有构造方法，防止外部创建新的实例。
     * 如果已存在实例，则抛出异常。
     */
    private EventBus() {
        if (instance != null) {
            throw new IllegalStateException("Cannot create a new instance, use getInstance() method.");
        }
        subscribers = new ArrayList<>();
    }

    /**
     * 获取单例实例的方法。
     *
     * @return EventBus的单例实例
     */
    public static EventBus getInstance() {
        if (instance == null) {
            synchronized (EventBus.class) {
                if (instance == null) {
                    instance = new EventBus();
                }
            }
        }
        return instance;
    }

    /**
     * 订阅事件，向事件总线注册订阅者。
     *
     * @param subscriber 订阅者对象
     */
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    /**
     * 取消事件订阅，从事件总线中移除订阅者。
     *
     * @param subscriber 已订阅的订阅者对象
     */
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    /**
     * 发布事件给所有订阅者。
     *
     * @param event 事件对象，包含温度数据、湿度数据大气压数据
     */
    public void publish(Event event) {
        for (Subscriber subscriber : subscribers) {
            if (executorService == null){
                subscriber.onEventUpdate(event);
            } else {
                executorService.execute(()->subscriber.onEventUpdate(event));
            }
        }
    }

    /**
     * 防止克隆操作，直接抛出异常。
     *
     * @return Object 无意义，因为直接抛出异常
     * @throws CloneNotSupportedException 克隆操作不允许
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone is not allowed.");
    }

    /**
     * 防止反序列化创建新实例，直接返回单例实例。
     *
     * @return EventBus 单例实例
     */
    protected Object readResolve() {
        return getInstance();
    }
}

