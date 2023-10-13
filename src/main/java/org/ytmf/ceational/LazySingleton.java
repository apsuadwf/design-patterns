package org.ytmf.ceational;

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
    private LazySingleton(){}

    // 3. 暴露一个方法，来获得实例
    public synchronized static LazySingleton getInstance(){
        if (null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
