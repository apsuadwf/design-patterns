package org.ytmf.creational.singleton;

import org.ytmf.creational.singleton.exception.MultipleSingletonException;

/**
 * 懒汉式单例模式的实现
 *
 * @author XieRongji
 * @date 2023/10/13 17:24
 **/

public class LazySingleton {
    // 1. 持有一个jvm全局唯一的实例
    private static LazySingleton instance;

    // 2. 为了避免随意的创建，私有化构造器
    private LazySingleton(){
        // 防止通过反射来创建实例
        if (null != instance){
            // 通过抛出异常来结束后续的代码
            throw new MultipleSingletonException("单例对象无法创建多个");
        }
    }

    // 3. 暴露一个方法，来获得实例
    public synchronized static LazySingleton getInstance(){
        if (null == instance){
            instance = new LazySingleton();
        }
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
