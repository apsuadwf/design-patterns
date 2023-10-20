package org.ytmf.structural.bridge;

import org.junit.jupiter.api.Test;
import org.ytmf.structural.bridge.abstractor.Connection;
import org.ytmf.structural.bridge.abstractor.DriverManager;

/**
 * @author XieRongji
 * @date 2023/10/20 22:04
 **/

public class BridgeTest {
    @Test
    public void text() throws ClassNotFoundException {
        Class.forName("org.ytmf.structural.bridge.implementor.MysqlDriver");
        DriverManager driverManager = new DriverManager();
        Connection connection = driverManager.getConnection();
        System.out.println(connection);
    }
}
