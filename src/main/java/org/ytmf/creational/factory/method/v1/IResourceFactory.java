package org.ytmf.creational.factory.method.v1;

/**
 * 资源工厂抽象接口
 *
 * @author XieRongji
 * @date 2023/10/16 23:14
 **/

public interface IResourceFactory {
    Resource create(String url);
}
