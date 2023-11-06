package org.ytmf.behavioral.observer.pubsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件总线，用于管理事件订阅和通知订阅者。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:02
 */
public class EventBus {
    /**
     * 使用Map维护事件类型与订阅者的映射关系。
     */
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    /**
     * 订阅特定类型的事件。
     *
     * @param eventType 事件类型
     * @param subscriber 对事件感兴趣的订阅者
     */
    public void subscribe(String eventType, Subscriber subscriber) {
        // 如果 eventType 键存在，获取对应的订阅者列表；如果不存在，则创建一个新列表
        subscribers.computeIfAbsent(eventType, k -> new ArrayList<>
                ()).add(subscriber);
    }

    /**
     * 取消订阅特定类型的事件。
     *
     * @param eventType   事件类型
     * @param subscriber  已订阅的事件的订阅者
     */
    public void unsubscribe(String eventType, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            subs.remove(subscriber);
        }
    }

    /**
     * 发布特定类型的事件给订阅者。
     *
     * @param eventType  事件类型
     * @param event      要发布的事件
     */
    public void publish(String eventType, String event) {
        List<Subscriber> subs = subscribers.get(eventType);
        if (subs != null) {
            for (Subscriber subscriber : subs) {
                subscriber.onEvent(event);
            }
        }
    }
    }
