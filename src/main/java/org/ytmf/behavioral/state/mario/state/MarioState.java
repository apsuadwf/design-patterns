package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:13
 */
public interface MarioState {
    /**
     * 吃蘑菇
     */
    MarioStateType mushroom();

    /**
     * 吃火焰花
     */
    MarioStateType fireFlower();

    /**
     * 敌人攻击
     */
    MarioStateType enemyAttack();

    /**
     * 掉进洞
     */
    MarioStateType fallIntoPit();
}
