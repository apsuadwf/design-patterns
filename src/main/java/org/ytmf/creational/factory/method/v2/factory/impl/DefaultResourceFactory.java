package org.ytmf.creational.factory.method.v2.factory.impl;

import org.ytmf.creational.factory.method.v1.Resource;
import org.ytmf.creational.factory.method.v2.factory.IResourceFactory;
import org.ytmf.creational.factory.method.v2.product.AbstractResource;
import org.ytmf.creational.factory.method.v2.product.impl.DefaultResource;

/**
 * @author XieRongji
 * @date 2023/10/16 23:19
 **/

public class DefaultResourceFactory implements IResourceFactory {
    @Override
    public AbstractResource create(String url) {
        // 省略创建过程
        return new DefaultResource(url);
    }
}
