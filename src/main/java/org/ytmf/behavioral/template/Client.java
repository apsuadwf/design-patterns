package org.ytmf.behavioral.template;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 13:12
 */
public class Client {
    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreteTemplateA();
        AbstractTemplate templateB = new ConcreteTemplateB();
        templateA.template();
        System.out.println("--------------------");
        templateB.template();
    }
}
