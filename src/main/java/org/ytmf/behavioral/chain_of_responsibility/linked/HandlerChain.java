package org.ytmf.behavioral.chain_of_responsibility.linked;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:16
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void doHandle() {
        if (head != null) {
            head.handle();
        }
    }
}
