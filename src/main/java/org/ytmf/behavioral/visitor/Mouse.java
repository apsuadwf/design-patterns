package org.ytmf.behavioral.visitor;

/**
 * 具体元素：鼠标
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:25
 */
public class Mouse implements ComputerPart {
    /**
     *  接受访问者的访问
     * @param computerPartVisitor 具体访问者
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // 访问 Mouse 对象
        computerPartVisitor.visit(this);

    }
}
