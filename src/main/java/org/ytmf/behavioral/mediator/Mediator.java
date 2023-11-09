package org.ytmf.behavioral.mediator;

/**
 * 中介者类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 21:07
 */
public interface Mediator {
    void send(String message,Colleague colleague);
}
