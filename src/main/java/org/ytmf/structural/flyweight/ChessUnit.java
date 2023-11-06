package org.ytmf.structural.flyweight;

/**
 * 棋子（享元类）
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:16
 */
public class ChessUnit {
    private Long id;
    private String text;
    private Color Color;
    public ChessUnit(Long id, String text, ChessUnit.Color color) {
        this.id = id;
        this.text = text;
        Color = color;
    }


    public static enum Color {
        /**
         * 红方棋子
         */
        RED,
        /**
         * 黑方棋子
         */
        BLACK
    }
}
