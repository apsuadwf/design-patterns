package org.ytmf.behavioral.state.mario.table_mapping;

/**
 * 马里奥
 * 使用if-else 语句实现的马里奥形态变化
 *
 * @Author: apsuadwf
 * @Date: 2023/11/08 8:48
 */
public class Mario {
    private MarioState state;
    /**
     * 使用二维数组定义状态转换表
     */
    private static final MarioState[][] TRANSITION_TABLE = {
            // SMALL, BIG, FIRE, DEAD
            // MUSHROOM
            {MarioState.BIG, MarioState.SMALL, MarioState.SMALL, MarioState.DEAD},
            // FIRE_FLOWER
            {MarioState.SMALL, MarioState.FIRE, MarioState.FIRE, MarioState.DEAD},
            // ENEMY_ATTACK
            {MarioState.DEAD, MarioState.SMALL, MarioState.BIG, MarioState.DEAD},
            // FALL_INTO_PIT
            {MarioState.DEAD, MarioState.DEAD, MarioState.DEAD, MarioState.DEAD}
    };

    public Mario() {
        state = MarioState.SMALL;
    }

    public void handleEvent(Event event) {
        // 使用查表法获取状态转换后的新状态
        MarioState newState = TRANSITION_TABLE[event.ordinal()][state.ordinal()];
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
