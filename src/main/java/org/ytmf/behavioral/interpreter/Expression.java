package org.ytmf.behavioral.interpreter;

import java.util.Map;

/**
 * 抽象表达式
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:36
 */
public interface Expression {

    /**
     * 抽象解释器
     *
     * @param variables 变量集合
     * @return 值
     */
    int interpret(Map<String,Integer> variables);
}
