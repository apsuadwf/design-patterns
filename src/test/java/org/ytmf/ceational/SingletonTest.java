package org.ytmf.ceational;

import org.junit.jupiter.api.Test;

/**
 * 单例模式测试类
 *
 * @author XieRongji
 * @date 2023/10/13 17:31
 **/

public class SingletonTest {
    @Test
    public void test(){
        System.out.println("EagerSingleton.getInstance() == EagerSingleton.getInstance() -> "
                + (EagerSingleton.getInstance() == EagerSingleton.getInstance()));
        System.out.println("LazySingleton.getInstance() == LazySingleton.getInstance() -> "
                + (LazySingleton.getInstance() == LazySingleton.getInstance()));
        System.out.println("DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance() -> "
                + (DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance()));
        /*
        * 输出结果：
        * EagerSingleton.getInstance() == EagerSingleton.getInstance() -> true
        * LazySingleton.getInstance() == LazySingleton.getInstance() -> true
        * DoubleCheckLockSingleton.getInstance() == DoubleCheckLockSingleton.getInstance() -> true
        * */
    }
}
