package org.ytmf.behavioral.mediator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 21:11
 */
public class Colleague2 extends Colleague{
    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 receives message:" + message);
    }
}
