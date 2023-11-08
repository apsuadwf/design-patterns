package org.ytmf.behavioral.visitor;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:28
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    /**
     * 访问 Computer 对象
     * @param computer Computer 对象
     */
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");

    }

    /**
     * 访问 Mouse 对象
     * @param mouse Mouse 对象
     */
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    /**
     * 访问 Keyboard 对象
     * @param keyboard Keyboard 对象
     */
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }
}
