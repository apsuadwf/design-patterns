package org.ytmf.behavioral.visitor;

/**
 * 元素接口
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:17
 */
public interface ComputerPart {
    /**
     * 接受访问者的访问
     * @param computerPartVisitor 具体访问者
     */
    void accept(ComputerPartVisitor computerPartVisitor);
}
