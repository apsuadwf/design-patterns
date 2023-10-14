package org.ytmf.ceational;

import java.io.Externalizable;
import java.io.Serializable;

/**
 * 双重检查锁懒汉式单例的实现
 *
 * @author XieRongji
 * @date 2023/10/13 17:29
 **/

public class DoubleCheckLockSingleton implements Serializable {

    /**
     * 这种单例模式可以实现延迟加载，即在需要时才创建对象，节省内存空间
     * 同时也可以保证线程安全，即多个线程同时访问时不会创建多个对象
     * 但是这种单例模式也有一些缺点，如：
     * - 使用volatile关键字会增加内存开销和性能损耗
     * - 使用synchronized关键字会导致锁竞争和阻塞
     * - 可能会被反射或者序列化破坏单例性
     */

    // 1. 持有一个jvm全局唯一的实例
    // 由于创建对象不是一个原子性的操作，即使使用了双重检查锁，也可能在创建的过程中产生半初始化状态
    // 使用volatile修饰instance变量，是为了保证其 *内存可见性* 和 *禁止指令重排序* 或者说是 *有序性*
    // instance变量可能会被多个线程同时访问和修改，使用volatile可以避免返回一个未初始化完成的对象
    // 事实上，1.9以上，不加 volatile 也可以实现单例，jvm内部处理有序性
    private volatile static DoubleCheckLockSingleton instance;

    // 2. 为了避免随意的创建，私有化构造器
    private DoubleCheckLockSingleton() throws IllegalAccessException {
        // 防止通过反射来创建实例
        if (null != instance) {
            // 通过抛出受检异常来结束后续的代码
            throw new MultipleSingletonException();
        }
    }

    // 3. 暴露一个方法，来获得实例
    // 第一次创建需要上锁，一旦创建好，就不需要上锁
    public static DoubleCheckLockSingleton getInstance() throws IllegalAccessException {
        if (null == instance) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (null == instance) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
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
