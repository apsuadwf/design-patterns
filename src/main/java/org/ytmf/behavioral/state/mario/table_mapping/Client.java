package org.ytmf.behavioral.state.mario.table_mapping;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:01
 */
public class Client {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.handleEvent(Event.MUSHROOM);
        mario.handleEvent(Event.FIRE_FLOWER);
        mario.handleEvent(Event.ENEMY_ATTACK);
        mario.handleEvent(Event.ENEMY_ATTACK);
        mario.handleEvent(Event.ENEMY_ATTACK);
        mario.handleEvent(Event.FIRE_FLOWER);
    }
}
