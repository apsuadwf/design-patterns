package org.ytmf.creational.prototype.deep;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XieRongji
 * @date 2023/10/19 16:01
 **/
@Data
public class Product implements Cloneable, Serializable {
    private String name;
    private double price;
    private int stock;


    // 省略构造函数、getter和setter方法
    @Override
    public Product clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
