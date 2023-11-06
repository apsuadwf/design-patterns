package org.ytmf.structural.facade.database;

/**
 * 数据库接口
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:32
 */
public interface Database {


    /**
     * 执行SQL方法
     * @param sql
     */
    void execute(String sql);
}
