package org.ytmf.behavioral.memento;

/**
 * 备忘录类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:54
 */
public class Memento {
    private final String state;
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
