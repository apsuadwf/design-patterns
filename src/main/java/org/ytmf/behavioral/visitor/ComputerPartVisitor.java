package org.ytmf.behavioral.visitor;

/**
 * 访问者接口
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:14
 */
public interface ComputerPartVisitor {

    /**
     * 访问 Computer 对象
     * @param computer Computer 对象
     */
    void visit(Computer computer);

    /**
     * 访问 Mouse 对象
     * @param mouse Mouse 对象
     */
    void visit(Mouse mouse);

    /**
     * 访问 Keyboard 对象
     * @param keyboard Keyboard 对象
     */
    void visit(Keyboard keyboard);
}
