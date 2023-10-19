package org.ytmf.structural.proxy.statical;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XieRongji
 * @date 2023/10/19 15:45
 **/

public class DataBaseDataQueryProxy implements DataQuery {

    /**
     * 模拟数据库缓存
     */
    private static final Map<String,String> CACHE =  new HashMap<>(256);

    /**
     * 代理谁，组合谁
     */
    private final DataBaseDataQuery dataQuery;

    public DataBaseDataQueryProxy() {
        // 屏蔽被代理对象
        this.dataQuery = new DataBaseDataQuery();
    }

    /**
     * 对代理方法做增强
     *
     * @param queryKey 查询主键
     * @return result
     */
    @Override
    public String query(String queryKey) {
        // 查询缓存，命中则返回
        String result = CACHE.get(queryKey);
        if (null != result){
            System.out.println("命中缓存，从缓存中获取结果；"+"key=>"+queryKey);
            return result;
        }
        // 未命中，查询数据库
        result = dataQuery.query(queryKey);

        // 结果不为空，将结果缓存
        if (null != result){
            CACHE.put(queryKey,result);
        }

        System.out.println("未命中，从数据源中查询结果");
        return result;
    }
}
