package org.ytmf.behavioral.observer.pubsub.weather;


/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 18:14
 */
public class Client {
    public static void main(String[] args) {
        // 获取EventBus实例
        EventBus eventBus = EventBus.getInstance();

        // 创建订阅者
        PhoneApp phoneApp = new PhoneApp();
        WebsiteDisplay websiteDisplay = new WebsiteDisplay();

        // 注册订阅者
        eventBus.subscribe(phoneApp);
        eventBus.subscribe(websiteDisplay);

        // 模拟数据变化并发布

        eventBus.publish(new Event(25.0f, 60.0f, 1013.0f));

        // 取消某个观察者的订阅
        eventBus.unsubscribe(phoneApp);

        // 再次模拟数据变化并发布
        eventBus.publish(new Event(26.0f, 55.0f, 1014.0f));

    }
}
