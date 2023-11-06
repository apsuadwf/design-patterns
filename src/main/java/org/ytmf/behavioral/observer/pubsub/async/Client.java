package org.ytmf.behavioral.observer.pubsub.async;


import java.util.concurrent.*;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 18:14
 */
public class Client {
    /**
     * 核心线程数
     */
    private static final int CORE_POOL_SIZE = 5;
    /**
     * 最大线程数
     */
    private static final int MAX_POOL_SIZE = 10;
    /**
     * 线程存活时间
     */
    private static final int KEEP_ALIVE_TIME = 60;
    /**
     * 任务队列
     */
    private static final int QUEUE_SIZE = 100;
    public static void main(String[] args) {
        // 创建自定义的 ThreadFactory
        ThreadFactory threadFactory = new ThreadFactory() {
            private int count = 1;

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "MyThread-" + count++);
            }
        };

        // 创建一个带有自定义 ThreadFactory 的 ThreadPoolExecutor
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_SIZE),
                threadFactory
        );

        // 获取EventBus实例
        EventBus eventBus = EventBus.getInstance();
        // 添加线程池
        eventBus.setExecutorService(executor);

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

        // 关闭线程池
        executor.shutdown();

    }
}
