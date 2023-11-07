package org.ytmf.behavioral.chain_of_responsibility.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 17:42
 */
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler){
        handlers.add(handler);
    }

    public void doHandle(Request request){
        if (handlers == null || handlers.size() == 0){
            return;
        }

        for (IHandler handler : handlers) {
            boolean handle = handler.handle(request);
            if (handle){
                return;
            }
        }
    }
}
