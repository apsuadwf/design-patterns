package org.ytmf.creational.singleton;

import org.ytmf.creational.singleton.exception.MultipleSingletonException;

/**
 * 饿汉式单例模式的实现
 *
 * @author XieRongji
 * @date 2023/10/13 01:30
 **/
public class EagerSingleton {

    /**
     * 1. 创建对象本身的复杂度
     * 很多的单例对象创建的过程可能及其复杂；
     * 很对单例对象创建完成后会占用很大的内存，比如缓存对象；
     * 很多单例对象创建完成后可能很小很简单；
     */

    // 1. 持有一个jvm全局唯一的实例
    private final static EagerSingleton instance;

    static {
        try {
            instance = new EagerSingleton();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // 2. 为了避免随意的创建，私有化构造器
    private EagerSingleton() throws IllegalAccessException {
        // 防止通过反射来创建实例
        if (null != instance){
            // 通过抛出受检异常来结束后续的代码
            throw new MultipleSingletonException();
        }
    }

    // 3. 暴露一个方法，来获得实例
    public static EagerSingleton getInstance(){
        return instance;
    }

    // 防止反序列话创建实例
    // 在jdk中ObjectInputStream的类中有readUnshared（）方法
    // 如果被反序列化的对象的类存在readResolve这个方法，
    // 他会调用这个方法来返回一个“array”（我也不明白），然后浅拷贝一份，作为返回值，并且无视掉反序列化的值，即使那个字节码已经被解析。
    // 详细解释：http://t.csdnimg.cn/hlCfi
    private Object readResolve() {
        return instance;
    }
}
