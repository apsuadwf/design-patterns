package org.ytmf.creational.factory.abstracted.product.impl;

import org.ytmf.creational.factory.abstracted.product.AbstractPictureResource;
import org.ytmf.creational.factory.abstracted.product.AbstractTextResource;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:26
 **/

public class HttpTextResource extends AbstractTextResource {
    public HttpTextResource() {
    }

    public HttpTextResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
