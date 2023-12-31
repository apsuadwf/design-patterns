package org.ytmf.structural.proxy.dynamic.jdk;

/**
 * 数据查询接口
 *
 * @author XieRongji
 * @date 2023/10/19 15:44
 **/

public interface DataQuery {
    String query(String queryKey);

    String queryAll(String queryKey);
}
