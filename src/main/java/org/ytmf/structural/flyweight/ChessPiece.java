package org.ytmf.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChessPiece {
    private ChessUnit chessUnit;
    private Position position;

}
