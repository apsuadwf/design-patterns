package org.ytmf.creational.builder;

/**
 * 抽象建造者类
 * 抽象建造类，确定产品由两个部件构成，partA,partB组成，
 * 并声明一个得到产品建造类结果的方法
 * @author XieRongji
 * @date 2023/10/18 16:36
 **/

public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
