package org.ytmf.behavioral.visitor;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:30
 */
public class ComputerPartUpdateVisitor implements ComputerPartVisitor {
    /**
     * 访问 Computer 对象并执行更新操作
     * @param computer Computer 对象
     */
    @Override
    public void visit(Computer computer) {
        System.out.println("Updating Computer.");
    }

    /**
     * 访问 Mouse 对象并执行更新操作
     * @param mouse Mouse 对象
     */
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Updating Mouse.");
    }

    /**
     * 访问 Keyboard 对象并执行更新操作
     * @param keyboard Keyboard 对象
     */
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Updating Keyboard.");
    }
}
