package org.ytmf.behavioral.state.mario.state;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:27
 */
public class Mario {
    private MarioState marioState;
    /**
     * 状态有限，进行缓存
     */
    private final Map<MarioStateType, MarioState> stateCache = new HashMap<>();

    public Mario() {
        stateCache.put(MarioStateType.SMALL,new MarioSmallState());
        stateCache.put(MarioStateType.BIG,new MarioBigState());
        stateCache.put(MarioStateType.FIRE,new MarioFireState());
        stateCache.put(MarioStateType.DEAD,new MarioDeadState());
        this.marioState = stateCache.get(MarioStateType.SMALL);
    }

    private void setMarioState(MarioState marioState) {
        this.marioState = marioState;
    }

    public void mushroom() {
        MarioStateType marioStateType = marioState.mushroom();
        setMarioState(stateCache.get(marioStateType));
    }

    public void fireFlower() {
        MarioStateType marioStateType = marioState.fireFlower();
        setMarioState(stateCache.get(marioStateType));
    }

    public void enemyAttack() {
        MarioStateType marioStateType = marioState.enemyAttack();
        setMarioState(stateCache.get(marioStateType));
    }

    public void fallIntoPit() {
        MarioStateType marioStateType = marioState.fallIntoPit();
        setMarioState(stateCache.get(marioStateType));
    }
}
