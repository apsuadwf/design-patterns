package org.ytmf.creational.factory.method.v1.impl;

import org.ytmf.creational.factory.method.v1.IResourceFactory;
import org.ytmf.creational.factory.method.v1.Resource;

/**
 * @author XieRongji
 * @date 2023/10/16 23:19
 **/

public class HttpResourceFactory implements IResourceFactory {
    @Override
    public Resource create(String url) {
        // 省略创建过程
        return new Resource(url);
    }
}
