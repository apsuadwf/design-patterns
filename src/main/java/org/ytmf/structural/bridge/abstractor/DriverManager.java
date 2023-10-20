package org.ytmf.structural.bridge.abstractor;

/**
 * @author XieRongji
 * @date 2023/10/20 21:40
 **/

public class DriverManager extends AbstractDriverManager {
    @Override
    public Connection getConnection() {
        System.out.println("这是由DriverManagerOne来管理的连接。");
        return super.getConnection();
    }
}
