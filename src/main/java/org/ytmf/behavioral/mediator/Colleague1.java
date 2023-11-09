package org.ytmf.behavioral.mediator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 21:10
 */
public class Colleague1 extends Colleague{
    public Colleague1(Mediator mediator) {
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
