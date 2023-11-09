package org.ytmf.behavioral.mediator;

/**
 * 同事接口
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 21:08
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void notify(String message);
}
