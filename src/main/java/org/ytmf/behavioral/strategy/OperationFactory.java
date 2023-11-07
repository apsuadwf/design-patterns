package org.ytmf.behavioral.strategy;

import java.util.HashMap;

/**
 * 测略工厂
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 15:12
 */
public class OperationFactory {
    private static final HashMap<String, Operation> OPERATION_MAP = new HashMap<>();

    static {
        /*
            这部分代码可以通过配置文件加载，更加符合开闭原则
         */
        OPERATION_MAP.put("+",new Addition());
        OPERATION_MAP.put("-",new Subtraction());
        OPERATION_MAP.put("*",new Multiplication());
    }

    public static Operation getOperation(String type){
        return OPERATION_MAP.get(type);
    }
}
