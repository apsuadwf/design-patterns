package org.ytmf.creational.builder;

/**
 * 指挥者类，用来指挥创建过程
 *
 * @author XieRongji
 * @date 2023/10/18 16:44
 **/

public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
