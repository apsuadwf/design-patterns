package org.ytmf.behavioral.template.callback;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 14:08
 */
public class AClass {
    public void process(ICallBack callBack){
        // 逻辑代码...
        callBack.methodToCallback();
        // 逻辑代码...
    }

    public void functionProcess(FunctionCallBack functionCallBack){
        functionCallBack.methodToCallBack();
    }
}
