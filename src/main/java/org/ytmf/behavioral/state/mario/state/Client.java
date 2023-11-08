package org.ytmf.behavioral.state.mario.state;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/08 9:43
 */
public class Client {
    public static void main(String[] args) {
        Mario mario = new Mario();
        mario.mushroom();
        mario.mushroom();
        mario.mushroom();
        mario.fireFlower();
        mario.enemyAttack();
        mario.fallIntoPit();
        mario.enemyAttack();
    }
}
