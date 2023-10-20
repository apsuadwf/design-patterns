package org.ytmf.structural.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author XieRongji
 * @date 2023/10/20 16:17
 **/

public class CacheMethodInterceptor implements MethodInterceptor {
    private final HashMap<String,String> cache = new LinkedHashMap<>(256);

    private DataBaseDataQuery databaseDataQuery;

    public CacheMethodInterceptor() {
        this.databaseDataQuery = new DataBaseDataQuery();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 1、判断是哪一个方法
        String result = null;
        if("query".equals(method.getName())){
            // 2、查询缓存，命中直接返回
            result = cache.get(objects[0].toString());
            if(result != null){
                System.out.println("数据从缓存重获取。");
                return result;
            }

            // 3、未命中，查数据库（需要代理实例）
            result = (String) method.invoke(databaseDataQuery, objects);

            // 4、如果查询到了,进行呢缓存
            cache.put(objects[0].toString(),result);
            return result;
        }

        return method.invoke(databaseDataQuery,objects);
    }
}
