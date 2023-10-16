package org.ytmf.creational.factory.method.v1;

import org.ytmf.creational.factory.exception.ResourceLoadException;
import org.ytmf.creational.factory.method.v1.impl.ClasspathResourceFactory;
import org.ytmf.creational.factory.method.v1.impl.DefaultResourceFactory;
import org.ytmf.creational.factory.method.v1.impl.FileResourceFactory;
import org.ytmf.creational.factory.method.v1.impl.HttpResourceFactory;

/**
 * 资源加载器
 *
 * @author XieRongji
 * @date 2023/10/16 22:31
 **/

public class ResourceLoader {

    private IResourceFactory resourceFactory ;

    public Resource load(String url) {
        // 1. 根据URL获取前缀判断类型
        String type = getType(url);

        // 2. 根据类型获得相应的工厂方法
        if ("http".equals(type)) {
            // ..发起请求下载资源... 可能很复杂
            resourceFactory = new HttpResourceFactory();
        } else if ("file".equals(type)) {
            // ..建立流，做异常处理等等
            resourceFactory = new FileResourceFactory();
        } else if ("classpath".equals(type)) {
            // ...
            resourceFactory = new ClasspathResourceFactory();
        } else {
            resourceFactory = new DefaultResourceFactory();
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
