package me.qingy.dp.structural.flyweight.chess;

import lombok.Getter;
import lombok.Setter;

/**
 * 享元类
 *
 * @author qingy
 * @since 2021-08-03
 */
@Getter
@Setter
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }
}
