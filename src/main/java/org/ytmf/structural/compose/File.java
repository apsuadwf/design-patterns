package org.ytmf.structural.compose;

/**
 * Leaf（叶子节点）
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:02
 */
public class File implements FileSystem {
    /**
     * 文件名
     */
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File: " + name);
    }
}
