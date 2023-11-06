package org.ytmf.behavioral.observer.pubsub;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:18
 */
public class Client {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        LoggingSubscriber loggingSubscriber = new LoggingSubscriber();
        NotificationSubscriber notificationSubscriber = new NotificationSubscriber();

        //订阅时事件
        eventBus.subscribe("eventA", loggingSubscriber);
        eventBus.subscribe("eventA", notificationSubscriber);

        // 发布事件
        eventBus.publish("eventA", "这是事件A的内容");
        // 取消订阅
        eventBus.unsubscribe("eventA", loggingSubscriber);
        // 再次发布事件
        eventBus.publish("eventA", "这是事件A的新内容");
    }
}
