package org.ytmf.behavioral.template;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/07 13:03
 */
public abstract class AbstractTemplate {
    // 1.定义算法骨架，理论上算法骨架应该不能被重写

    /**
     * 算法骨架
     */
    public final void template(){
         // 执行具体的步骤
         step1();
         step2();
         step3();
         step4();
         step5();
    }

    /*
        部分步骤由模版实现
     */

    public void step1() {
        System.out.println("step1");
    }

    /**
     * 抽象方法由子类实现
     */
    public abstract void step2();

    /**
     * 抽象方法由子类实现
     */
    public abstract void step3();

    public void step4() {
        System.out.println("step4");
    }
    public void step5() {
        System.out.println("step5");
    }
}
