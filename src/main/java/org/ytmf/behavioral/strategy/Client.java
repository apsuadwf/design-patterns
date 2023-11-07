package org.ytmf.behavioral.strategy;

/**
 * 实现一个计算器，支持加法、
 * 减法和乘法运算。我们可以使用策略模式将各种运算独立为不同的策略，并让客户端
 * 根据需要选择和使用不同的策略。
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 14:58
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));

        calculator.setOperation(new Subtraction());
        System.out.println("10 - 5 = " + calculator.executeOperation(10, 5));

        calculator.setOperation(new Multiplication());
        System.out.println("10 * 5 = " + calculator.executeOperation(10, 5));

    }
}
