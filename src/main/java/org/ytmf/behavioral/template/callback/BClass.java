package org.ytmf.behavioral.template.callback;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 14:10
 */
public class BClass {
    public static void main(String[] args) {
        AClass aClass = new AClass();
        aClass.process(new ICallBack() {
            @Override
            public void methodToCallback() {
                System.out.println("Call back me ...");
            }
        });
        aClass.functionProcess(()-> System.out.println("Function interface call back me ..."));
    }
}
