package org.ytmf.behavioral.chain_of_responsibility.linked;

/**
 * 处理请求链的抽象类。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 16:08
 */
public abstract class Handler {
    /**
     * 后继处理者
     */
    protected Handler successor = null;

    /**
     * 设置处理链中的下一个处理者。
     *
     * @param successor 处理链中的下一个处理者
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求。每个具体的处理者必须实现此方法以处理请求。
     */
    public abstract void handle();
}