package org.ytmf.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:18
 */
public class ChessUnitFactory {
    private static Map<Long,ChessUnit> chessUnitMap = new HashMap<>(64);
    static {
        chessUnitMap.put(1L, new ChessUnit(1L, "兵", ChessUnit.Color.RED));
        chessUnitMap.put(2L, new ChessUnit(2L, "车", ChessUnit.Color.RED));
        chessUnitMap.put(3L, new ChessUnit(3L, "马", ChessUnit.Color.RED));
        chessUnitMap.put(4L, new ChessUnit(4L, "炮", ChessUnit.Color.RED));
        chessUnitMap.put(5L, new ChessUnit(5L, "象", ChessUnit.Color.RED));
        chessUnitMap.put(6L, new ChessUnit(6L, "士", ChessUnit.Color.RED));
        chessUnitMap.put(7L, new ChessUnit(7L, "将", ChessUnit.Color.RED));

        chessUnitMap.put(8L, new ChessUnit(8L, "卒", ChessUnit.Color.BLACK));
        chessUnitMap.put(9L, new ChessUnit(9L, "车", ChessUnit.Color.BLACK));
        chessUnitMap.put(10L, new ChessUnit(10L, "马", ChessUnit.Color.BLACK));
        chessUnitMap.put(11L, new ChessUnit(11L, "炮", ChessUnit.Color.BLACK));
        chessUnitMap.put(12L, new ChessUnit(12L, "象", ChessUnit.Color.BLACK));
        chessUnitMap.put(13L, new ChessUnit(13L, "士", ChessUnit.Color.BLACK));
        chessUnitMap.put(14L, new ChessUnit(14L, "帅", ChessUnit.Color.BLACK));
    }

    /**
     * 暴露一个工厂方法，用来获取棋子
     * @param id 棋子的id
     * @return 棋子
     */
    public static ChessUnit getChessUnit(Long id){
        return chessUnitMap.get(id);
    }
}
