package org.ytmf.creational.factory.exception;

/**
 * 资源加载异常类
 *
 * @author XieRongji
 * @date 2023/10/16 22:38
 **/

public class ResourceLoadException extends RuntimeException{
    public ResourceLoadException() {
        super();
    }

    public ResourceLoadException(String message) {
        super(message);
    }
}
