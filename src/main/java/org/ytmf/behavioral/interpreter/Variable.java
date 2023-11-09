package org.ytmf.behavioral.interpreter;

import java.util.Map;

/**
 *  终结符表达式：变量
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:38
 */
public class Variable implements Expression {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Integer> variables) {
        return variables.getOrDefault(name,0);
    }
}
