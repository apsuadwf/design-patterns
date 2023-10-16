package org.ytmf.creational.factory.method.v2.product.impl;

import org.ytmf.creational.factory.method.v2.product.AbstractResource;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:26
 **/

public class DefaultResource extends AbstractResource {
    public DefaultResource() {
    }

    public DefaultResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
