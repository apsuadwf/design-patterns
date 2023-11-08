package org.ytmf.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:55
 */
public class Caretaker {
    private final List<Memento> mementoList = new ArrayList<>();
    public void add(Memento state) {
        mementoList.add(state);
    }
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
