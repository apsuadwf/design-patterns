package org.ytmf.behavioral.observer.pubsub.async;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 18:10
 */
public interface Subscriber {
    void onEventUpdate(Event event);
}
