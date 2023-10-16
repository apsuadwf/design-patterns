package org.ytmf.creational.factory.abstracted.factory.impl;

import org.ytmf.creational.factory.abstracted.factory.IResourceFactory;
import org.ytmf.creational.factory.abstracted.product.*;

/**
 * @author XieRongji
 * @date 2023/10/16 23:19
 **/

public class FileResourceFactory implements IResourceFactory {

    @Override
    public AbstractPictureResource loadPictureResource(String url) {
        return new AbstractPictureResource(url);
    }

    @Override
    public AbstractVideoResource loadVideoResource(String url) {
        return new AbstractVideoResource(url);
    }

    @Override
    public AbstractTextResource loadTestResource(String url) {
        return new AbstractTextResource(url);
    }
}
