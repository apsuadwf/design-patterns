package org.ytmf.creational.factory.method.v1;

import org.ytmf.creational.factory.exception.ResourceLoadException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 资源加载器
 *
 * @author XieRongji
 * @date 2023/10/16 22:31
 **/

public class ResourceLoader3 {

    private static final Map<String, IResourceFactory> RESOURCE_FACTORY_CACHE = new HashMap<>();

    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("factory/resource.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            for (Map.Entry<Object,Object> entry : properties.entrySet()){
                String key = entry.getKey().toString();
                Class<?> clazz = Class.forName(entry.getValue().toString());
                IResourceFactory resourceFactory = (IResourceFactory) clazz.getConstructor().newInstance();
                RESOURCE_FACTORY_CACHE.put(key,resourceFactory);
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println("缓存创建完成！");
    }

    public Resource load(String url) {
        // 1. 根据URL获取前缀判断类型
        String type = getType(url);

        // 2. 根据类型获得相应的工厂方法
        IResourceFactory resourceFactory = RESOURCE_FACTORY_CACHE.get(type);
        if (null == resourceFactory){
            resourceFactory = RESOURCE_FACTORY_CACHE.get("default");
        }

        System.out.println(resourceFactory.getClass().getSimpleName());

        // 3. 创建Resource
        return resourceFactory.create(url);
    }

    /**
     * 截取url前缀
     *
     * @param url url
     * @return prefix
     */
    private String getType(String url) {
        // 参数验证
        if (null == url || !url.contains(":")) {
            throw new ResourceLoadException("URL不合法！");
        }
        String[] strings = url.split(":");
        return strings[0];
    }
}
