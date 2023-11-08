package org.ytmf.behavioral.memento;

/**
 * 发起人类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:53
 */
public class Originator {
    private String state;
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * 恢复状态
     *
     * @param memento
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
