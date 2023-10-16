package org.ytmf.creational.factory.method.v2.factory;

import org.ytmf.creational.factory.method.v1.Resource;
import org.ytmf.creational.factory.method.v2.product.AbstractResource;

/**
 * 资源工厂抽象接口
 *
 * @author XieRongji
 * @date 2023/10/16 23:14
 **/

public interface IResourceFactory {
    AbstractResource create(String url);
}
