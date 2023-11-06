package org.ytmf.structural.adapter.clazz;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 14:47
 */
public class ClassAdapterExample {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
