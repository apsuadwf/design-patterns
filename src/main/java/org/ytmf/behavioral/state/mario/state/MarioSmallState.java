package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:17
 */
public class MarioSmallState implements MarioState {
    @Override
    public MarioStateType mushroom() {
        System.out.println("马里奥吃蘑菇，变大");
        return MarioStateType.BIG;
    }

    @Override
    public MarioStateType fireFlower() {
        System.out.println("马里奥吃火花，加分数");
        return MarioStateType.SMALL;
    }

    @Override
    public MarioStateType enemyAttack() {
        System.out.println("马里奥被敌人攻击，死亡");
        return MarioStateType.DEAD;
    }

    @Override
    public MarioStateType fallIntoPit() {
        System.out.println("马里奥掉进洞，死亡");
        return MarioStateType.DEAD;
    }
}
