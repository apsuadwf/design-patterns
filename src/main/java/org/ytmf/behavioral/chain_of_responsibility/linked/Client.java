package org.ytmf.behavioral.chain_of_responsibility.linked;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:20
 */
public class Client {
    public static void main(String[] args) {
        // 创建处理器链
        HandlerChain handlerChain = new HandlerChain();

        // 添加不同的处理器
        handlerChain.addHandler(new AHandler());
        handlerChain.addHandler(new BHandler());

        handlerChain.doHandle();
    }
}
