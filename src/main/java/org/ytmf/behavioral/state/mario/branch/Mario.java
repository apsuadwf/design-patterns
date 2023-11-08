package org.ytmf.behavioral.state.mario.branch;

/**
 * 马里奥
 * 使用if-else 语句实现的马里奥形态变化
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 8:48
 */
public class Mario {
    private MarioState state;

    public Mario() {
        state = MarioState.SMALL;
    }

    public void handleEvent(Event event) {
        MarioState newState = state;

        // 处理吃蘑菇事件
        if (event == Event.MUSHROOM) {
            if (state == MarioState.SMALL) {
                newState = MarioState.BIG;
            }
            // 处理吃火花
        } else if (event == Event.FIRE_FLOWER) {
            if (state == MarioState.BIG) {
                newState = MarioState.FIRE;
            }
            // 处理遇到小怪事件
        } else if (event == Event.ENEMY_ATTACK) {
            if (state == MarioState.BIG) {
                newState = MarioState.SMALL;
            } else if (state == MarioState.FIRE) {
                newState = MarioState.BIG;
            } else if (state == MarioState.SMALL) {
                newState = MarioState.DEAD;
            }
            // 处理掉坑事件
        } else if (event == Event.FALL_INTO_PIT) {
            newState = MarioState.DEAD;
        }
        System.out.printf("从 %s 变为 %s%n", state, newState);
        state = newState;
    }

    private enum MarioState {
        /**
         * SMALL:小马里奥
         * BIG: 大马里奥
         * FIRE: 火焰马里奥
         * DEAD: 死亡
         */
        SMALL, BIG, FIRE, DEAD
    }
}
