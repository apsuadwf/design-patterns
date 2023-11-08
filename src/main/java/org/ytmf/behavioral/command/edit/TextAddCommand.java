package org.ytmf.behavioral.command.edit;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 17:45
 */
public class TextAddCommand implements Command {
    private StringBuilder stringBuilder;
    private String text;


    public TextAddCommand(StringBuilder stringBuilder, String text) {
        this.stringBuilder = stringBuilder;
        this.text = text;
    }

    @Override
    public void execute() {
        stringBuilder.append(text);
    }

    @Override
    public void undo() {
        stringBuilder.delete(stringBuilder.length() - text.length(),stringBuilder.length());
    }
}
