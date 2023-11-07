package org.ytmf.behavioral.chain_of_responsibility.linked;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:15
 */
public class BHandler extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        System.out.println("第二个处理器");
        //...
        if (!handled && successor != null) {
            successor.handle();
        }

    }
}
