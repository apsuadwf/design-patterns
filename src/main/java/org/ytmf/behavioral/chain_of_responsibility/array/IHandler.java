package org.ytmf.behavioral.chain_of_responsibility.array;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:38
 */
public interface IHandler {

    /**
     * 抽象的请求处理方法
     *
     * @param request 传递的请求
     * @return true代表已处理，false代表未处理
     */
    boolean handle(Request request);
}
