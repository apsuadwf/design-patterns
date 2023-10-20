package org.ytmf.structural.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author XieRongji
 * @date 2023/10/20 18:37
 **/

public class DecoratorTest {
    @Test
    public void test(){
        //1、创建一个原始对象
        Component component = new ConcreteComponent();

        // 2、进行第一次包装
        component = new DecoratorOne(component);

        // 3、进行第二次包装
        component = new DecoratorTwo(component);

        component.operation();
    }
}
