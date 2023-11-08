package org.ytmf.behavioral.command.edit;

import java.util.Stack;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:41
 */
public class TextEditor {
    /**
     * 维护一个文本
     */
    private StringBuilder text = new StringBuilder();

    /**
     * 命令执行栈
     */
    private Stack<Command> commandHistory ;

    public TextEditor() {
        this.text = new StringBuilder();
        this.commandHistory = new Stack<>();
    }

    public void addText(String newText){
        // 创建新的命名执行，并保存
        Command command = new TextAddCommand(text,newText);
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        // 找到上一次的命令，并执行undo方法
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }

    public void printContent() {
        System.out.println(text.toString());
    }

}
