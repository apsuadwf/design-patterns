package org.ytmf.structural.bridge.abstractor;

/**
 * @author XieRongji
 * @date 2023/10/20 21:37
 **/

public abstract class AbstractDriverManager {

    /**
     * 依赖于抽象接口而不是具体实现
     * 具体的驱动实现类
     */
    private static Driver driver;

    public Connection getConnection(){
        return driver.connect();
    }

    public static void register(Driver driver){
        AbstractDriverManager.driver = driver;
    }
}

