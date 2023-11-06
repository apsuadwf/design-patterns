package org.ytmf.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 21:21
 */
public class ThreadPoolUtil {
    private static ThreadPoolExecutor threadPool;

    private ThreadPoolUtil() {
        // 私有构造函数，防止实例化
    }

    /**
     * 初始化线程池（使用默认参数）
     */
    public static void initThreadPool() {
        initThreadPool(5, 10, 60, 100);
    }

    /**
     * 初始化线程池（使用指定参数）
     *
     * @param corePoolSize 核心线程数
     * @param maxPoolSize 最大线程数
     * @param keepAliveTime 线程存活时间
     * @param queueCapacity 任务队列容量
     */
    public static void initThreadPool(int corePoolSize, int maxPoolSize, long keepAliveTime, int queueCapacity) {
        if (threadPool == null || threadPool.isShutdown()) {
            threadPool = new ThreadPoolExecutor(
                    corePoolSize,
                    maxPoolSize,
                    keepAliveTime,
                    TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<>(queueCapacity),
                    new ThreadPoolExecutor.CallerRunsPolicy());
        }
    }

    /**
     * 执行任务
     *
     * @param task 任务
     */
    public static void executeTask(Runnable task) {
        if (threadPool != null && !threadPool.isShutdown()) {
            threadPool.execute(task);
        }
    }

    /**
     * 关闭线程池
     */
    public static void shutdown() {
        if (threadPool != null && !threadPool.isShutdown()) {
            threadPool.shutdown();
        }
    }
}
