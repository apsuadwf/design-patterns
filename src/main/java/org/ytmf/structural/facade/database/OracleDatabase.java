package org.ytmf.structural.facade.database;

/**
 * Oracle 数据库实现
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:34
 */
public class OracleDatabase implements Database {
    @Override
    public void execute(String sql) {
        System.out.println("Executing " + sql + " in Oracle database");
    }
}
