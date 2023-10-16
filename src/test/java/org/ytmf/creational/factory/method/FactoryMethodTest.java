package org.ytmf.creational.factory.method;

import org.junit.jupiter.api.Test;
import org.ytmf.creational.factory.method.v1.Resource;
import org.ytmf.creational.factory.method.v1.ResourceLoader;
import org.ytmf.creational.factory.method.v1.ResourceLoader2;
import org.ytmf.creational.factory.method.v1.ResourceLoader3;
import org.ytmf.creational.factory.method.v2.product.AbstractResource;

/**
 * 工厂方法模式测试类
 *
 * @author XieRongji
 * @date 2023/10/16 22:41
 **/

public class FactoryMethodTest {
    private final String[] URLs = {"file://D://a.test","http://a.test","classpath://D://a.test","D://a.test"};
    @Test
    public void test1(){
        ResourceLoader resourceLoader = new ResourceLoader();

        for (String URL : URLs){
            Resource resource = resourceLoader.load(URL);
            System.out.println(resource.toString());
        }
    }
    @Test
    public void test2(){;
        ResourceLoader2 resourceLoader2 = new ResourceLoader2();

        for (String URL : URLs){
            Resource resource = resourceLoader2.load(URL);
            System.out.println(resource.toString());
        }
    }

    @Test
    public void test3(){;
        ResourceLoader3 resourceLoader3 = new ResourceLoader3();

        for (String URL : URLs){
            Resource resource = resourceLoader3.load(URL);
            System.out.println(resource.toString());
        }
    }

    @Test
    public void v2Test(){;
        org.ytmf.creational.factory.method.v2.ResourceLoader resourceLoader = new org.ytmf.creational.factory.method.v2.ResourceLoader();

        for (String URL : URLs){
            AbstractResource resource = resourceLoader.load(URL);
            System.out.println(resource.toString());
        }
    }

    @Test
    public void abstractMethodTest(){;
        org.ytmf.creational.factory.abstracted.ResourceLoader resourceLoader = new org.ytmf.creational.factory.abstracted.ResourceLoader();

        for (String URL : URLs){
            org.ytmf.creational.factory.abstracted.product.Resource resourceText = resourceLoader.loadText(URL);
            System.out.println(resourceText.toString());
            org.ytmf.creational.factory.abstracted.product.Resource resourcePicture = resourceLoader.loadPicture(URL);
            System.out.println(resourcePicture.toString());
            org.ytmf.creational.factory.abstracted.product.Resource resourceVideo = resourceLoader.loadVideo(URL);
            System.out.println(resourceVideo.toString());
        }
    }

}
