package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:21
 */
public class MarioBigState implements MarioState {
    @Override
    public MarioStateType mushroom() {
        System.out.println("大马里奥吃蘑菇，加分数");
        return MarioStateType.BIG;
    }

    @Override
    public MarioStateType fireFlower() {
        System.out.println("大马里奥吃火花，变火焰马里奥");
        return MarioStateType.FIRE;
    }

    @Override
    public MarioStateType enemyAttack() {
        System.out.println("大马里奥被攻击，变小马里奥");
        return MarioStateType.SMALL;
    }

    @Override
    public MarioStateType fallIntoPit() {
        System.out.println("大马里奥掉进洞，死亡");
        return MarioStateType.DEAD;
    }
}
