package org.ytmf.behavioral.chain_of_responsibility.array;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:46
 */
public class Client {
    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();

        handlerChain.addHandler(new BHandler());
        handlerChain.addHandler(new AHandler());

        handlerChain.doHandle(new Request(30));
        System.out.println("------------------------");
        handlerChain.doHandle(new Request(10));
    }
}
