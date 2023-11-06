package org.ytmf.behavioral.observer.pubsub.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 19:21
 */
public class MessageSubscriber {
    @Subscribe
    public void handleMessageEvent(MessageEvent event) {
        System.out.println("收到消息: " + event.getMessage());
    }
}
