package org.ytmf.behavioral.strategy;

/**
 * 上下文类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/07 14:57
 */
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double executeOperation(double num1, double num2) {
        return operation.execute(num1, num2);
    }
}
