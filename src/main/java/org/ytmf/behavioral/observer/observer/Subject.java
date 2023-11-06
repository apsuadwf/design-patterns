package org.ytmf.behavioral.observer.observer;

/**
 * 被观察者应该提供注册、删除、通知观察者的能力
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:41
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
