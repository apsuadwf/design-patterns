package org.ytmf.structural.facade.external;

/**
 * 门面类
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 15:26
 */
public class Facade {
    private ExternalService externalService = new ExternalService();
    private ExternalService2 externalService2 = new ExternalService2();

    public void doSomething1(){
        externalService.doSomeThing();
    }

    public void doSomething2(){
        externalService2.doSomeThing();
    }
}
