package org.ytmf.behavioral.command.edit;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 20:11
 */
public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.addText("Hello,");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.addText("World!");
        textEditor.printContent();

        System.out.println("--------------");

        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.undo();
        textEditor.printContent();

    }
}
