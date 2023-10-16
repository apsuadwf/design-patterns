package org.ytmf.creational.factory.abstracted.product.impl;

import org.ytmf.creational.factory.abstracted.product.AbstractPictureResource;
import org.ytmf.creational.factory.abstracted.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:26
 **/

public class DefaultVideoResource extends AbstractVideoResource {
    public DefaultVideoResource() {
    }

    public DefaultVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
