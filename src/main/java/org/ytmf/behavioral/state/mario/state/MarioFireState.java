package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:21
 */
public class MarioFireState implements MarioState {
    @Override
    public MarioStateType mushroom() {
        System.out.println("火焰马里奥吃蘑菇，加分数");
        return MarioStateType.FIRE;
    }

    @Override
    public MarioStateType fireFlower() {
        System.out.println("火焰马里奥吃火花，加分数");
        return MarioStateType.FIRE;
    }

    @Override
    public MarioStateType enemyAttack() {
        System.out.println("火焰马里奥被攻击，变大马里奥");
        return MarioStateType.BIG;
    }

    @Override
    public MarioStateType fallIntoPit() {
        System.out.println("火焰马里奥掉进洞，死亡");
        return MarioStateType.DEAD;
    }
}
