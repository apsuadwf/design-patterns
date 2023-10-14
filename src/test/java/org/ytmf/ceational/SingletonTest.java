package org.ytmf.ceational;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式测试类
 *
 * @author XieRongji
 * @date 2023/10/13 17:31
 **/

public class SingletonTest {
    @Test
    public void test() throws IllegalAccessException {
        System.out.println("EagerSingleton.getInstance() == EagerSingleton.getInstance() -> "
                + (EagerSingleton.getInstance() == EagerSingleton.getInstance()));
        System.out.println("LazySingleton.getInstance() == LazySingleton.getInstance() -> "
                + (LazySingleton.getInstance() == LazySingleton.getInstance()));
        System.out.println("DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance() -> "
                + (DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance()));
        System.out.println("InnerSingleton.getInstance() == InnerSingleton.getInstance() -> "
                + (InnerSingleton.getInstance() == InnerSingleton.getInstance()));
        System.out.println("EnumSingleton.INSTANCE == EnumSingleton.INSTANCE -> "
                + (EnumSingleton.INSTANCE == EnumSingleton.INSTANCE));
        /*
        * 输出结果：
        * EagerSingleton.getInstance() == EagerSingleton.getInstance() -> true
        * LazySingleton.getInstance() == LazySingleton.getInstance() -> true
        * DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance() -> true
        * InnerSingleton.getInstance() == InnerSingleton.getInstance() -> true
        * EnumSingleton.INSTANCE == EnumSingleton.INSTANCE -> true
        * */
    }
    @Test
    public void eagerSingletonTest(){
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println("Result:"+ (e1 == e2));
    }

    @Test
    public void reflectNewInstanceTest() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<DoubleCheckLockSingleton> clazz = DoubleCheckLockSingleton.class;
        Constructor<DoubleCheckLockSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        boolean result = DoubleCheckLockSingleton.getInstance() == constructor.newInstance();
        System.out.println("Result:"+ result);
    }
}
