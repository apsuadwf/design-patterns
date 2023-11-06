package org.ytmf.behavioral.observer.pubsub.guava;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 19:21
 */
public class MessageEvent {
    private String message;
    public MessageEvent(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
