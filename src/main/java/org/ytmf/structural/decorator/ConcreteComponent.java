package org.ytmf.structural.decorator;

/**
 * @author XieRongji
 * @date 2023/10/20 18:32
 **/

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("这是未被包装的原始类");
    }
}
