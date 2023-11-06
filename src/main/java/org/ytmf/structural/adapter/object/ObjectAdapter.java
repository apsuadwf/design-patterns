package org.ytmf.structural.adapter.object;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 14:53
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }


    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

