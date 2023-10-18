package org.ytmf.creational.builder;

import org.junit.jupiter.api.Test;

/**
 * @author XieRongji
 * @date 2023/10/18 16:47
 **/

public class BuilderTest {
    @Test
    public void test(){
        Director director = new Director();
        ProductBuilder1 productBuilder1 = new ProductBuilder1();
        ProductBuilder2 productBuilder2 = new ProductBuilder2();
        director.construct(productBuilder1);
        Product product1 = productBuilder1.getResult();
        product1.show();
        director.construct(productBuilder2);
        Product product2 = productBuilder2.getResult();
        product2.show();
    }

    @Test
    public void HTMLDocumentTest(){
        HTMLDocument.Builder builder = new HTMLDocument.Builder();
        HTMLDocument htmlDocument = builder.addHeader("header").addBody("body").addFooter("footer").build();
        String document = htmlDocument.toString();
        System.out.println(document);
    }
}
