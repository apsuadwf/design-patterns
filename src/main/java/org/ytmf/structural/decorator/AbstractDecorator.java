package org.ytmf.structural.decorator;

/**
 * 默认装饰器类
 *
 * @author XieRongji
 * @date 2023/10/20 18:33
 **/

public abstract class AbstractDecorator implements Component{
    /**
     * 装饰器设计模式使用组合的形式进行装设
     */
    Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
