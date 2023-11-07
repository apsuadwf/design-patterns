package org.ytmf.behavioral.strategy;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 14:55
 */
public class Addition implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}
