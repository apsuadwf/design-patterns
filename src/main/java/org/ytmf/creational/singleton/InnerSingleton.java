package org.ytmf.creational.singleton;

import org.ytmf.creational.singleton.exception.MultipleSingletonException;

/**
 * 静态内部类单例
 *
 * @author XieRongji
 * @date 2023/10/14 15:44
 **/

public class InnerSingleton {
    // 1. 私有化构造器
    private InnerSingleton(){
        // 防止通过反射来创建实例
        if (null != InnerSingletonHolder.instance){
            // 通过抛出异常来结束后续的代码
            throw new MultipleSingletonException("单例对象无法创建多个");
        }
    };

    // 2. 提供一个获取单例的方法
    public static InnerSingleton getInstance(){
        return InnerSingletonHolder.instance;
    }

    // 3. 静态内部类
    // 特性：类加载的时机---> 一个类会在第一次主动使用的时候被加载
    // 实例会在内部类加载（调用getInstance方法的时候）创建
    private static class InnerSingletonHolder{
        private static final InnerSingleton instance= new InnerSingleton();
    }

    // 防止反序列话创建实例
    // 在jdk中ObjectInputStream的类中有readUnshared（）方法
    // 如果被反序列化的对象的类存在readResolve这个方法，
    // 他会调用这个方法来返回一个“array”（我也不明白），然后浅拷贝一份，作为返回值，并且无视掉反序列化的值，即使那个字节码已经被解析。
    // 详细解释：http://t.csdnimg.cn/hlCfi
    private Object readResolve() {
        return InnerSingletonHolder.instance;
    }
}
