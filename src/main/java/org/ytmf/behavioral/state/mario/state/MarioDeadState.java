package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:21
 */
public class MarioDeadState implements MarioState {
    @Override
    public MarioStateType mushroom() {
        System.out.println("马里奥已死亡，无法吃蘑菇");
        return MarioStateType.DEAD;
    }

    @Override
    public MarioStateType fireFlower() {
        System.out.println("马里奥已死亡，无法吃火化");
        return MarioStateType.DEAD;
    }

    @Override
    public MarioStateType enemyAttack() {
        System.out.println("马里奥已死亡，无法被攻击");
        return MarioStateType.DEAD;
    }

    @Override
    public MarioStateType fallIntoPit() {
        System.out.println("马里奥已死亡，无法掉进洞");
        return MarioStateType.DEAD;
    }
}
