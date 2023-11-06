package org.ytmf.structural.facade.database;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:39
 */
public class Client {
    /**
     * mysql类型
     */
    public static final String MYSQL_TYPE = "MySQL";
    /**
     * Oracle 类型
     */
    public static final String ORACLE_TYPE = "Oracle";

    public static void main(String[] args) {
        DatabaseFacade databaseFacade = new DatabaseFacade();
        String sql = "select * from user";
        databaseFacade.executeSQL(sql,MYSQL_TYPE);
        databaseFacade.executeSQL(sql,ORACLE_TYPE);
    }
}
