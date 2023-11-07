package org.ytmf.behavioral.chain_of_responsibility.array;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:39
 */
public class AHandler implements IHandler {
    @Override
    public boolean handle(Request request) {
        if (request.getNum() > 20){
            System.out.println("A 处理器处理！");
            request.setNum(request.getNum() + 30);
            // 请求已被处理
            return true;
        }
        System.out.println("A处理器无法处理，交给下一个处理");
        return false;
    }
}
