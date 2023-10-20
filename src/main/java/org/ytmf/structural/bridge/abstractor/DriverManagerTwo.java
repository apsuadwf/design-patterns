package org.ytmf.structural.bridge.abstractor;

/**
 * @author XieRongji
 * @date 2023/10/20 21:42
 **/

public class DriverManagerTwo extends AbstractDriverManager {
    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverManagerTwo来管理的连接。");
        return super.getConnection();
    }
}
