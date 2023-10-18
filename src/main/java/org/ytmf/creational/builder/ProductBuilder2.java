package org.ytmf.creational.builder;

/**
 * 具体的建造者类
 * @author XieRongji
 * @date 2023/10/18 16:41
 **/

public class ProductBuilder2 extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
