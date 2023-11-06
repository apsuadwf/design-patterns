package org.ytmf.behavioral.observer.pubsub.guava;

import com.google.common.eventbus.EventBus;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 19:22
 */
public class Client {
    public static void main(String[] args) {
        // 创建Guava中提供的线程总线
        EventBus eventBus = new EventBus();

        // 创建订阅者并注册
        MessageSubscriber messageSubscriber = new MessageSubscriber();
        eventBus.register(messageSubscriber);

        // 发布事件
        eventBus.post(new MessageEvent("事件1"));

        // 取消注册
        eventBus.unregister(messageSubscriber);

        // 再次发布事件
        eventBus.post(new MessageEvent("事件2"));
    }
}
