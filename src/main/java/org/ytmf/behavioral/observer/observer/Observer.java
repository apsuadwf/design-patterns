package org.ytmf.behavioral.observer.observer;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:43
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
