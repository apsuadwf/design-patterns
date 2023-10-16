package org.ytmf.creational.factory.abstracted.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.InputStream;

/**
 * @author XieRongji
 * @date 2023/10/17 00:48
 **/

@Getter
@Setter
@ToString
public class AbstractPictureResource implements Resource {
    // 图片的一些公用的成员变量，方法都可以定义在这个类中
    private String url;


    public AbstractPictureResource() {
    }

    public AbstractPictureResource(String url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
