package org.ytmf.behavioral.observer.pubsub;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 17:25
 */
public class NotificationSubscriber implements Subscriber {
    @Override
    public void onEvent(String event) {
        // 在事件发生时发送通知
        System.out.println("Received Event: " + event + ". Sending notification to users.");
        // 可以在这里编写发送通知的逻辑，比如邮件、短信、App推送等
    }
}
