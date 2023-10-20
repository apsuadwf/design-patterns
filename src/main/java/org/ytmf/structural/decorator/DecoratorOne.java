package org.ytmf.structural.decorator;

/**
 * 第一层装饰
 *
 * @author XieRongji
 * @date 2023/10/20 18:35
 **/

public class DecoratorOne extends AbstractDecorator {

    public DecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("这是前边添加了行为！--第一次包装");
        super.operation();
        System.out.println("这是后边添加了行为！--第一次包装");
    }
}
