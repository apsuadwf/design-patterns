package org.ytmf.creational.factory.abstracted.factory;

import org.ytmf.creational.factory.abstracted.product.*;

/**
 * ResourceFactory,每一个工厂实例，都可以生产一个产品族
 *
 * @author XieRongji
 * @date 2023/10/16 23:14
 **/

public interface IResourceFactory {
    /**
     * 加载图片资源的工厂方法
     * @param url 给定的资源url
     * @return 图片资源
     */
    AbstractPictureResource loadPictureResource(String url);

    /**
     * 加载视频资源的工厂方法
     * @param url 给定的资源url
     * @return 视频资源
     */
    AbstractVideoResource loadVideoResource(String url);

    /**
     * 加载文本资源的工厂方法
     * @param url 给定的资源url
     * @return 文本资源
     */
    AbstractTextResource loadTestResource(String url);
}
