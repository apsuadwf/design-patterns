package org.ytmf.behavioral.interpreter;

import java.util.Map;

/**
 * 非终结符表达式：减法
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:42
 */
public class Subtract implements Expression {
    private Expression left;
    private Expression right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return left.interpret(variables) - right.interpret(variables);
    }

}
