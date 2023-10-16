package org.ytmf.creational.singleton.exception;

/**
 * 自定义单例异常类
 *
 * @author XieRongji
 * @date 2023/10/14 15:38
 **/

public class MultipleSingletonException extends UnsupportedOperationException{
    public MultipleSingletonException() {
    }

    public MultipleSingletonException(String message) {
        super(message);
    }

    public MultipleSingletonException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultipleSingletonException(Throwable cause) {
        super(cause);
    }
}
