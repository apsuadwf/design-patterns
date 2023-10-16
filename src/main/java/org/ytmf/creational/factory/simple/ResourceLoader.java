package org.ytmf.creational.factory.simple;

import org.ytmf.creational.factory.exception.ResourceLoadException;

/**
 * 资源加载器
 *
 * @author XieRongji
 * @date 2023/10/16 22:31
 **/

public class ResourceLoader {

    public Resource load(String url){
        // 1. 根据URL获取前缀判断类型
        String prefix = getPrefix(url);

        // 2. 调用工厂生产
        return ResourceFactory.create(prefix,url);
    }

    /**
     * 截取url前缀
     * @param url url
     * @return prefix
     */
    private String getPrefix(String url) {
        // 参数验证
        if (null == url || !url.contains(":")){
            throw new ResourceLoadException("URL不合法！");
        }
        String[] strings = url.split(":");
        return strings[0];
    }
}
