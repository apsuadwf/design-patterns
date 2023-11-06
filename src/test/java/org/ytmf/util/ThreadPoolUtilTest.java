package org.ytmf.util;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Member;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 21:45
 */
public class ThreadPoolUtilTest {
    @Test
    public void main() {
        int taskCount = 1000; // 任务数量
        long start;
        long end;

        // 初始化线程池
        ThreadPoolUtil.initThreadPool(10, 50, 60, 500);

        // 测试线程池执行时间
        start = System.nanoTime();
        for (int i = 0; i < taskCount; i++) {
            ThreadPoolUtil.executeTask(() -> {
                // 模拟某项任务
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        end = System.nanoTime();

        System.out.println("Time taken with ThreadPoolUtil: " + ((end - start) / 1_000_000) + " ms");

        // 关闭线程池
        ThreadPoolUtil.shutdown();
    }
}
