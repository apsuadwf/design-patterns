package org.ytmf.structural.facade.database;

/**
 * 数据库门面类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:35
 */
public class DatabaseFacade {

    private Database mysql;
    private Database oracle;

    public DatabaseFacade() {
        this.mysql = new MysqlDatabase();
        this.oracle = new OracleDatabase();
    }

    public void executeSQL(String sql, String databaseType){
        if (databaseType.equals("MySQL")) {
            mysql.execute(sql);
        } else if (databaseType.equals("Oracle")) {
            oracle.execute(sql);
        } else {
            throw new IllegalArgumentException("Unknown database type: " +
                    databaseType);
        }
    }
}
