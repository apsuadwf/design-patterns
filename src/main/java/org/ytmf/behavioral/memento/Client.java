package org.ytmf.behavioral.memento;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 16:55
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置状态并保存到备忘录
        originator.setState("State1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State2");
        caretaker.add(originator.saveStateToMemento());

        // 从备忘录中恢复状态
        originator.getStateFromMemento(caretaker.get(0));

        // 输出：恢复的状态: State1
        System.out.println("恢复的状态: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(1));

        // 输出：恢复的状态: State2
        System.out.println("恢复的状态: " + originator.getState());
    }
}
