package org.ytmf.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件组成
 *
 * @author XieRongji
 * @date 2023/10/18 16:30
 **/

public class Product {
    List<String> parts = new ArrayList<>();

    /**
     * 添加产品部件
     * @param part 部件
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 列举出所有的产品
     */
    public void show(){
        System.out.println("\n 产品创建---------");
        for (String part : parts){
            System.out.println(part);
        }
    }

}
