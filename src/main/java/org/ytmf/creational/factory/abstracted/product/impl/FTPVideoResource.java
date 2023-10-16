package org.ytmf.creational.factory.abstracted.product.impl;

import org.ytmf.creational.factory.abstracted.product.AbstractTextResource;
import org.ytmf.creational.factory.abstracted.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:26
 **/

public class FTPVideoResource extends AbstractVideoResource {
    public FTPVideoResource() {
    }

    public FTPVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
