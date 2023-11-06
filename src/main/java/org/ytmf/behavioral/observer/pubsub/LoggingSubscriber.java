package org.ytmf.behavioral.observer.pubsub;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:19
 */
public class LoggingSubscriber implements Subscriber {

    @Override
    public void onEvent(String event) {
        // 在事件发生时记录日志
        System.out.println("Event occurred: " + event + ". Logging to file or database.");
    }
}
