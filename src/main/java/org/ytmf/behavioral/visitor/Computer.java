package org.ytmf.behavioral.visitor;

/**
 * 具体元素
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:19
 */
public class Computer implements ComputerPart{

    /**
     * 子元素数组
     */
    private ComputerPart[] parts;


    public Computer() {
        // 初始化子元素数组
        parts = new ComputerPart[]{new Mouse(),new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 遍历所有子元素并接受访问者的访问
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }

        // 访问 computer 对象本身
        computerPartVisitor.visit(this);
    }
}
