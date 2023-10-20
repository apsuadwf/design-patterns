package org.ytmf.structural.bridge.implementor;

import org.ytmf.structural.bridge.abstractor.Connection;
import org.ytmf.structural.bridge.abstractor.Driver;
import org.ytmf.structural.bridge.abstractor.DriverManager;

/**
 * @author XieRongji
 * @date 2023/10/20 21:45
 **/

public class MysqlDriver implements Driver {
    static {
        DriverManager.register(new MysqlDriver());
    }
    @Override
    public Connection connect() {
        return new Connection("mysql");
    }
}
