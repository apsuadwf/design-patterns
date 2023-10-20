package org.ytmf.structural.proxy.dynamic.aop;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XieRongji
 * @date 2023/10/20 16:55
 **/

public class Cache {

    private static final Map<String,String> MAP = new ConcurrentHashMap<>(256);

    public static String get(String key){
        return MAP.get(key);
    }

    public static void put(String key,String value){
        MAP.put(key, value);
    }
}
