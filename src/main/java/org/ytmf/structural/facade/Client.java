package org.ytmf.structural.facade;

import org.ytmf.structural.facade.external.Facade;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:28
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doSomething1();
        facade.doSomething2();
    }
}
