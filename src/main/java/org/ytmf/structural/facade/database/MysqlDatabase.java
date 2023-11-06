package org.ytmf.structural.facade.database;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:33
 */
public class MysqlDatabase implements Database {
    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql + " in MySQL database");
    }
}
