package org.ytmf.structural.adapter.object;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 14:47
 */
public class ClassAdapterExample {
    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
