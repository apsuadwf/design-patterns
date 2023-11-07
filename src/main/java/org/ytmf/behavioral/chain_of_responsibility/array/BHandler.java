package org.ytmf.behavioral.chain_of_responsibility.array;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:41
 */
public class BHandler implements IHandler {
    @Override
    public boolean handle(Request request) {
        if (request.getNum() > 100){
            System.out.println("B 处理器处理！");
            request.setNum(request.getNum() +10);
            return true;
        }
        System.out.println("B处理器无法处理，交给下一个处理");
        return false;
    }
}
