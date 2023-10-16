package org.ytmf.creational.factory.abstracted.product.impl;

import org.ytmf.creational.factory.abstracted.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:26
 **/

public class ClasspathPictureResource extends AbstractPictureResource {
    public ClasspathPictureResource() {
    }

    public ClasspathPictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
