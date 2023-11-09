package org.ytmf.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:50
 */
public class Client {
    public static void main(String[] args) {
        // 构建语法树
        Expression left = new Variable("a");
        Expression right = new Variable("b");
        Expression add = new Addition(left, right);
        Expression subtract = new Subtract(add, right);

        // 设置变量值
        Map<String, Integer> variables = new HashMap<>();
        variables.put("a", 10);
        variables.put("b", 5);

        // 解释表达式
        int result = subtract.interpret(variables);
        System.out.println("Result: " + result); // 输出：Result: 10
    }
}
