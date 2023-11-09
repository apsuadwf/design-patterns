package org.ytmf.behavioral.mediator;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 21:27
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        Colleague1 colleague1 = new Colleague1(concreteMediator);
        Colleague2 colleague2 = new Colleague2(concreteMediator);

        concreteMediator.setColleague1(colleague1);
        concreteMediator.setColleague2(colleague2);

        colleague1.send("Hello,Colleague2!");
        colleague2.send("Hello,Colleague1!");
    }
}
