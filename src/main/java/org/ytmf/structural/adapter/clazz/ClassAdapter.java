package org.ytmf.structural.adapter.clazz;

/**
 * 使用继承来实现适配的能力
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 14:45
 */
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.specificRequest();
    }
}
