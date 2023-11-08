package org.ytmf.behavioral.state.tv;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 18:46
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.turnOn();
        tv.adjustVolume(10);
        tv.turnOff();

        System.out.println("------------------");

        tv.adjustVolume(100);
        tv.turnOff();
        tv.turnOn();
    }
}
