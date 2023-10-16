package org.ytmf.creational.factory.simple;

import org.junit.jupiter.api.Test;

/**
 * 简单工厂模式测试类
 *
 * @author XieRongji
 * @date 2023/10/16 22:41
 **/

public class SimpleFactoryTest {
    @Test
    public void test(){
        String[] URLs = {"file://D://a.test","http://a.test","classpath://D://a.test","D://a.test"};

        ResourceLoader resourceLoader = new ResourceLoader();

        for (String URL : URLs){
            Resource resource = resourceLoader.load(URL);
            System.out.println(resource.toString());
        }
    }
}
