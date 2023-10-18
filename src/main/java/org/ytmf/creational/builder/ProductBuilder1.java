package org.ytmf.creational.builder;

/**
 * 具体的建造者类
 * @author XieRongji
 * @date 2023/10/18 16:41
 **/

public class ProductBuilder1 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
