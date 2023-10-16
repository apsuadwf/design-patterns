package org.ytmf.creational.factory.method.v2.product;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.InputStream;

/**
 * 抽象资源类
 *
 * @author XieRongji
 * @date 2023/10/17 00:21
 **/
@Getter
@Setter
@ToString
public abstract class AbstractResource {

    private String url;

    public AbstractResource(){};
    public AbstractResource(String url) {
        this.url = url;
    }

    protected void shared(){
        System.out.println("共享方法");
    }

    /**
     * 每个子类需要独自实现的方法
     * @return 字节流
     */
    public abstract InputStream getInputStream();
}
