package org.ytmf.ceational;

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
    private final static EagerSingleton instance = new EagerSingleton();

    // 2. 为了避免随意的创建，私有化构造器
    private EagerSingleton(){}

    // 3. 暴露一个方法，来获得实例
    public static EagerSingleton getInstance(){
        return instance;
    }
}
