package org.ytmf.behavioral.command.edit;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:39
 */
public interface Command {
    /**
     * 抽象执行命令
     */
    void execute();

    /**
     * 抽象撤销方法
     */
    void undo();
}
