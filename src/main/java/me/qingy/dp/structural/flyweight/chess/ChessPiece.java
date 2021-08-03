package me.qingy.dp.structural.flyweight.chess;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qingy
 * @since 2021-08-03
 */
@Getter
@Setter
public class ChessPiece {
    private ChessPieceUnit chessPieceUnit;
    private int positionX;
    private int positionY;

    public ChessPiece(ChessPieceUnit unit, int positionX, int positionY) {
        this.chessPieceUnit = unit;
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
