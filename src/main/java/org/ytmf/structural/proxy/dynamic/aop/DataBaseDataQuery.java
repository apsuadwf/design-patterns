package org.ytmf.structural.proxy.dynamic.aop;


import org.springframework.stereotype.Component;

/**
 * @author XieRongji
 * @date 2023/10/19 15:45
 **/
@Component
public class DataBaseDataQuery implements DataQuery {
    @Override
    public String query(String queryKey) {
        // 使用数据源从数据库查询数据,很慢
        System.out.println("key=>"+queryKey+"；正在从数据库查询数据");
        return "result";
    }
}
