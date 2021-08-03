package me.qingy.dp.structural.flyweight.chess.normal;

import lombok.Getter;
import lombok.Setter;

/**
 * 棋子
 * 大量棋局都需要创建重复的 ChessPiece 对象
 *
 * @author qingy
 * @since 2021-08-03
 */
@Getter
@Setter
public class ChessPiece {
    private int id;
    private String text;
    private Color color;
    private int positionX;
    private int positionY;

    public ChessPiece(int id, String text, Color color, int positionX, int positionY) {
        this.id = id;
        this.text = text;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public static enum Color {
        RED, BLACK
    }
}
