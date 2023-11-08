package org.ytmf.behavioral.visitor;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:27
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个 Computer 对象
        Computer computer = new Computer();
        // 创建一个具体访问者
        ComputerPartDisplayVisitor displayVisitor = new ComputerPartDisplayVisitor();
        // 让 Computer 对象接受访问者的访问
        computer.accept(displayVisitor);

        System.out.println("--------------------");
        ComputerPartUpdateVisitor updateVisitor = new ComputerPartUpdateVisitor();
        computer.accept(updateVisitor);
    }
}
