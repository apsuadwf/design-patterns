package org.ytmf.creational.singleton;

/**
 * 枚举单例的实现
 *
 * @author XieRongji
 * @date 2023/10/14 15:59
 **/

public enum EnumSingleton {
    // 在这种实现方式中，既可以避免多线程同步问题；还可以防止通过反射和反序列化来重新创建新的对象。
    // 因为Java虚拟机会保证枚举对象的唯一性，因此每一个枚举类型和定义的枚举变量在JVM中都是唯一的。
    INSTANCE;
    public void businessMethod() {
        System.out.println("我是一个单例！");
    }
}
