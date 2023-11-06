package org.ytmf.behavioral.observer.pubsub;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:00
 */
public interface Subscriber {
    void onEvent(String event);
}
