package org.ytmf.creational.factory.simple;

/**
 * 简单工厂模式
 *
 * @author XieRongji
 * @date 2023/10/15 17:35
 **/

public class ResourceFactory {
    public static Resource create(String type, String url){
        if("http".equals(type)){
            // ..发起请求下载资源... 可能很复杂
            return new Resource(url);
        } else if ("file".equals(type)) {
            // ..建立流，做异常处理等等
            return new Resource(url);
        } else if ("classpath".equals(type)) {
            // ...
            return new Resource(url);
        } else {
            return new Resource("default");
        }
    }
}
