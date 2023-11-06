package org.ytmf.structural.compose;

import java.util.ArrayList;
import java.util.List;

/**
 *  Composite（组合节点）
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:05
 */
public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children;
    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }
    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }
    public void remove(FileSystem fileSystem) {
        children.remove(fileSystem);
    }
    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem fileSystem : children) {
            fileSystem.display();
        }
    }

}
