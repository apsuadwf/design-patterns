package org.ytmf.behavioral.interpreter;

import java.util.Map;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:39
 */
public class Addition implements Expression {

    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return left.interpret(variables) + right.interpret(variables);
    }
}
