package org.ytmf.behavioral.observer.pubsub;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:01
 */
public class ConcrereObserver implements Subscriber {
    @Override
    public void onEvent(String event) {
        System.out.println("收到事件: " + event);
    }
}
